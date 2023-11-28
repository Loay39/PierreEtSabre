package histoire;

import java.util.Arrays;

public class Humain {
	private static final int CAPACITE_MEMOIRE = 3;
	protected String  nom;
	private String boissonFavori;
	private int argent;
	protected int nbConnaissance = 0;

	private Humain[] memoire = new Humain [CAPACITE_MEMOIRE];
	
	public Humain(String nom, String boissonFavori, int argent) {
		this.nom = nom;
		this.boissonFavori = boissonFavori;
		this.argent = argent;
	}
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boissonFavori);
		
	}
	public void boire() {
		parler("Hmmm ! Un bon verre de " + boissonFavori + "GLOUPS !");
	}
	protected void perdreArgent(int perte) {
		argent-=perte;
	}
	protected void gagnerArgent(int gain) {
		argent+=gain;
	}                                                         
	public void acheter(String bien, int prix) {
		if (prix<=argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une boisson a " + prix + " sous");
			perdreArgent(prix);	
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir un "+ bien + " a " + prix + " sous");
		}
	}
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	private void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		if (nbConnaissance == CAPACITE_MEMOIRE) {
			for (int i = 0; i < CAPACITE_MEMOIRE - 1; i++) {
				memoire[i] = memoire[i+1];
			}
		memoire[CAPACITE_MEMOIRE - 1] = autreHumain;
		} else {
			memoire[nbConnaissance] = autreHumain;
			nbConnaissance ++;
		}
	}
	public void listerConnaissance() {
		StringBuilder bld = new StringBuilder();
		for (int i = 0; i < nbConnaissance - 1; i++) {
			bld.append(memoire[i].getNom() + ", ");
		}
		bld.append(memoire[nbConnaissance - 1].getNom());
		String chaine = "Je connais beaucoup de monde dont : " + bld.toString();
		parler(chaine);
	}
	
	
	
	public Humain[] getMemoire() {
		return memoire;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public String getBoissonFavori() {
		return boissonFavori;
	}
	
	public int getArgent() {
		return argent;
	}
	
	
	
}
