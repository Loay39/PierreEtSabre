package histoire;

public class Ronin extends Humain {
	private int attributHonneur = 1 ;
	public Ronin(String nom, String boissonFavori, int argent) {
		super(nom,boissonFavori,argent);
	}
	void donner(Commercant beneficiaire) {
		double argentDonne = 0.1 * getArgent();
		int argentDonneInt = (int) argentDonne;
		parler("Marco prend ces "+argentDonneInt+" sous");
		beneficiaire.recevoir(argentDonneInt);
		perdreArgent(argentDonneInt);
	}
	public void provoquer(Yakuza adversaire) {
		int force = 2* attributHonneur;
		if (force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa ");
			int argentGagne= adversaire.perdre();
			gagnerArgent(argentGagne);
			attributHonneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
		}
	}
}
