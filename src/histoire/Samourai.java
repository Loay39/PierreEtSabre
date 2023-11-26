package histoire;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String seigneur, String nom, String boissonFavori, int argent) {
		super(nom, boissonFavori, argent);
		this.seigneur = seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur);
	}
	
	
}
