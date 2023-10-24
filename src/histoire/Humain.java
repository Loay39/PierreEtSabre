package histoire;

public class Humain {
	private String  nom;
	private String boissonFavori;
	private int quantiteArgent;
	
	public Humain(String nom, String boissonFavori, int quantiteArgent) {
		this.nom = nom;
		this.boissonFavori = boissonFavori;
		this.quantiteArgent = quantiteArgent;
	}
	public void parler(String texte) {
		System.out.println(texte);
	}
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + "Et mon boisson favori est " + boissonFavori);
		
	}
	public void boire() {
		parler("Hmmm ! Un bon verre de " + boissonFavori + "GLOUPS !");
	}
	public void perdreArgent(int perte) {
		quantiteArgent-=perte;
	}
	public void gagnerArgent(int gain) {
		quantiteArgent+=gain;
	}
	public void acheter(String bien, int prix) {
		if (prix<=quantiteArgent) {
			parler("J'ai" + quantiteArgent + "sous en poche. Je vais pouvoir m'offrir une boisson à " + prix + " sous");
			perdreArgent(prix);	
		}
		else {
			parler("Je n'ai plus que" + quantiteArgent + "sous en poche. Je ne peux même pas m'offrir un "+ bien + "à" + prix + "sous");
		}
	}
	
	public String getNom() {
		return nom;
	}
	public String getBoissonFavori() {
		return boissonFavori;
	}
	
	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	
	
}
