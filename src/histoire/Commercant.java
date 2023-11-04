package histoire;

public class Commercant extends Humain {
	public Commercant(String nom , String boissonFavori ,int argent) {
		super(nom,boissonFavori,argent); 		
	} 
	public int seFaireExtorquer() {
		int argentPerdu = argent;
		perdreArgent(argent);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentPerdu;
	}
	public void recevoir(int argent){
		gagnerArgent(argent);
		parler (argent + " Je te remercie généreux donateur! " );
	}
}
