package histoire;

public class Humain {
	protected String  nom;
	protected String boissonFavori;
	protected int argent;
	
	public Humain(String nom, String boissonFavori, int argent) {
		this.nom = nom;
		this.boissonFavori = boissonFavori;
		this.argent = argent;
	}
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + "Et mon boisson favori est " + boissonFavori);
		
	}
	public void boire() {
		parler("Hmmm ! Un bon verre de " + boissonFavori + "GLOUPS !");
	}
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	public void gagnerArgent(int gain) {
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
