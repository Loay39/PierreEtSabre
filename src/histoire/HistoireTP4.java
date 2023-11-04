package histoire;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof ","kombusha ",54);
		prof.direBonjour();
		prof.acheter("kombosha", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("kimono", 50);
		Commercant marco = new Commercant("Marco", "The", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}

}
