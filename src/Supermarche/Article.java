package Supermarche;

public class Article {
	
	
	//nom,prix solde_booleen
	private String nom=new String();
	private double prix=0;
	private boolean isSolde=false;
	
	
	public Article(String n, double p, boolean isSolde) {
		// TODO Auto-generated constructor stub
		this.isSolde=isSolde;
		this.prix=p;
		this.nom=n;
	}
public void afficherArticle() {
	// TODO Auto-generated method stub
	//System.out.println(this.nom + " "+this.prix+"is solde :"+this.isSolde);

}
public String getNom() {
	return nom;
}
public double getPrix() {
	return prix;
}
public boolean isSolde() {
	return isSolde;
}
	

}
