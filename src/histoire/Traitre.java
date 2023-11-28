package histoire;
import java.util.Random;
public class Traitre extends Samourai {
	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boissonFavori, int argent) {
		super(seigneur, nom, boissonFavori, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("mais je suis un traitre de niveau " + niveauTraitrise + "chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconne = argentCommercant * 2/10;
			perdreArgent(argentRanconne);
			gagnerArgent(argentRanconne);
			niveauTraitrise++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRanconne + " sous ou gare a toi");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me demasquer. ");
		}	
	}
	
	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami avec personne car je ne connais personne ! Snif.");
		} else {
			Humain[] memoire = getMemoire();
			Random random = new Random();
			int indiceAleatoire = random.nextInt(nbConnaissance);
			int don = getArgent() * 1 / 20;
			Humain ami = memoire[indiceAleatoire];
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami avec " + ami.getNom() + ".");
			parler("Bonjour l'ami! Je veux vous aider en vous donnant " + don + "sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + getNom() + "Vous etes qqn de bien.");
			if (niveauTraitrise > 1) {
				niveauTraitrise --;
				}
			}
	}
	}
	
