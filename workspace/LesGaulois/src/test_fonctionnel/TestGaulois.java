package test_fonctionnel;
import personnages.Romain;
import personnages.Gaulois;
import personnages.Druide;


public class TestGaulois {

	public static void main(String[] args) {
	Gaulois asterix = new Gaulois("Astérix",8);
	Gaulois obelix = new Gaulois("Obélix", 16);
	Romain brutus = new Romain("Brutus",2);
	Druide panoramix = new Druide("panoramix", 2);
	
	
	panoramix.fabriquerPotion(4, 3);
	panoramix.booster(obelix);
	panoramix.booster(asterix);
	
	
	//asterix.parler("Bonjoue Obélix");
	//obelix.parler("Bonjour Astérix. Ca te dirait d'aller chasser des sangliers ?");
	//asterix.parler("Oui très bonne idée.");
	
	//Romain minus = new Romain("Minus", 6);
	//System.out.println(" Dans la forêt " + asterix.getNom() + " et " + obelix.getNom() + " tombent nez à nez sur le romain " +


	brutus.getNom();
	int i=0;
	while( i <3) {
		asterix.frapper(brutus);
		brutus.parler("Aie");
		i++;
	}
	asterix.frapper(brutus);
	brutus.parler("J'abandonne !");
	
}	

}
