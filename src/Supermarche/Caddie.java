package Supermarche;

import java.util.ArrayList;

public class Caddie {
	//un ensemble d achats
	private ArrayList<Achat> list_article = new ArrayList<>();

	public void remplir(Article art, int q) {
		// TODO Auto-generated method stub
		Achat achat = new Achat(art,q);
		this.list_article.add(achat);
	}

	public ArrayList<Achat> getList_article() {
		return list_article;
	}

}
