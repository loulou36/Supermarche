package Supermarche;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Caisse {

	private int idCaisse=0;
	private double sommeTotalAchat=0;
	ArrayList<Achat> totalAchat = new ArrayList<>();
	
	Date dateCourante = new Date();
	SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy");
	
	public Caisse(int i, double d) {
		// TODO Auto-generated constructor stub
		this.idCaisse=i;
		this.sommeTotalAchat=d;
	}
	//scanner articles
	//enregistrer contenu des caddies OK Scanner
	//a un numero OK 
	//total des achats scanned OK 
	
	
	//enregistrer contenu des caddies add achat to this caddie looks like
	public void scanner(Caddie caddie1) {
		// TODO Auto-generated method stub
		//need to get all articles and put them in totalAchat
		for (Achat a : caddie1.getList_article()) {
			//a.afficherAchat();
			totalAchat.add(a);
		}
		
	}
	

	public void totalCaisse() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
		System.out.println(formatDate.format(dateCourante));
		System.out.println("Caisse numero "+this.idCaisse);
		System.out.println();
		for (Achat a : totalAchat)
		{
			a.afficherAchat();
			//ajouter a la somme totale le prix de chaque achat totalachat +=a.q*a.p
			this.sommeTotalAchat+=(a.getQuantite()*a.getPrix());
			//a.getPrix()
		}
		System.out.println("Montant A Payer : "+sommeTotalAchat+" Frs");
		System.out.println();
		System.out.println("======================================================");
	}
	
}
