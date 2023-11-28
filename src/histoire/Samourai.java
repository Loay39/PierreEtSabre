package histoire;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String seigneur, String nom, String boissonFavori, int argent) {
		super(nom, boissonFavori, argent);
		this.seigneur = seigneur;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur);
	}
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais boire comme boisson ? Tiens je vais prendre du " + boisson);
	}
	
}
