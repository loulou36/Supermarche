package Supermarche;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Achat {
	
	

	public Achat(Article art, int q) {
		// TODO Auto-generated constructor stub
		this.article=art;
		this.quantite=q;
	}
	// achat is ?? 1 article et la quantite 
	private Article article;
	private int quantite=0;

	public void afficherAchat() {
		if (this.article.isSolde()) {
			System.out.println(this.article.getNom()+" : "+this.article.getPrix()+" x "+this.quantite+" = "+this.article.getPrix()*this.quantite*0.5+" Frs    (1/2 prix)");
		}else {
			
		
		System.out.println(this.article.getNom()+" : "+this.article.getPrix()+" x "+this.quantite+" = "+this.article.getPrix()*this.quantite+" Frs");
		}
	}

	public int getQuantite() {
		return this.quantite;
	}
;	public double getPrix() {
		double p=0;
		if (this.article.isSolde()) {
			p=this.article.getPrix()*0.5;	
		}else {
			p=this.article.getPrix();
		}
		return p;
		}

}
