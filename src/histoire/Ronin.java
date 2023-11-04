package histoire;

public class Ronin extends Humain {
	int attributHonneur = 1 ;
	public Ronin(String nom, String boissonFavori, int argent) {
		super(nom,boissonFavori,argent);
	}
	void donner(Commercant beneficiaire) {
		double argentDonne = 0.1 * argent;
		int argentDonneInt = (int) argentDonne;
		parler("Marco prend ces "+argentDonneInt+" sous");
		beneficiaire.recevoir(argentDonneInt);
		perdreArgent(argentDonneInt);
	}
}
