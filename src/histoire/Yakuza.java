package histoire;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 4;
	public Yakuza(String nom, String boissonFavori, int argent, String clan) {
		super(nom,boissonFavori,argent);
		this.clan=clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?" );
		parler(victime.getNom() + "si tu tiens à la vie donne moi ta bourse !");
		int argentVole=victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		reputation++;
		parler("J'ai pique les "+argentVole+" de "+ victime.getNom() + " ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
	}
	public int perdre() {
		parler("J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan);
		int argentPerdu = argent;
		perdreArgent(argent);
		reputation--;
		return argentPerdu;
		
	}
	public void gagner (int gain ) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + "?");
		parler("Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
}
