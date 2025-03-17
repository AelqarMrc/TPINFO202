/**
 * Classe <b>TestToutou</b>
 * Cette classe permet de tester la classe <b>Toutou</b>
 * @see Toutou
 * @author Jessica Jonquet
 * @version 13/03/2025
 */
import java.io.IOException;

public class TestToutou{
	public static void main(String[] args) {
		Toutou milou;
		Toutou medor;
		
		System.out.println("Creation d’un premier toutou");
		try {
			milou = new Toutou("Milou", Robe.BLANCHE, 4);
		}
		catch(IOException e){
			System.out.println("Interception "+ e.getMessage());
			milou = new Toutou();
		}
		
		System.out.println("Creation d’un deuxieme toutou");
		try{
			medor = new Toutou("Medor", Robe.CHOCOLAT, -11);
		}
		catch(IOException e){
			System.out.println("Interception "+ e.getMessage());
			medor = new Toutou();
		}
		System.out.println();

		System.out.println("Affichage des deux toutous");
		System.out.println(milou);
		System.out.println(medor);

		System.out.println("Verifications des getters");
		System.out.println(milou.getNom());
		System.out.println(medor.getNbPuces());

		System.out.println("Verifications du setters");
		milou.setNbPuces(-100);
		medor.setNbPuces(99);
		

		if(milou.egalA(medor))
			System.out.println("Milou et Medor sont identiques");
		else
			System.out.println("Milou et Medor sont differents");
		
		if(milou.egalA(milou))
			System.out.println("Milou et Milou sont identiques");
		else
			System.out.println("Milou et Milou sont differents");
	}
}
