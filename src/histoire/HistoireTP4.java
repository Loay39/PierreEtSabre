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
		Yakuza yuko = new Yakuza("Yoku Le Noir ", "Le Wiskhy ", 30 , "Warsong ");
		yuko.direBonjour();
		yuko.extorquer(marco);
		Ronin roro = new Ronin("Roro ", "shochu ", 60);
		roro.direBonjour();
		roro.donner(marco);
		roro.parler(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		roro.provoquer(yuko);
	}

}
