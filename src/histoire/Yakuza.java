package histoire;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 4;
	public Yakuza(String nom, String boissonFavori, int argent, String clan) {
		super(nom,boissonFavori,argent);
		this.clan=clan;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan );
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
		parler("J'ai pique les "+argentVole+" de "+ victime.getNom() + " ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	public int perdre() {
		parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + clan);
		int argentPerdu = getArgent();
		perdreArgent(getArgent());
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
