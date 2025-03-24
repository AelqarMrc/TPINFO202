import java.util.Scanner;
import animalerie.*;

public class TestAnimal{
	
	public static void main(String[] args){
		Scanner clavier = new Scanner(System.in);
		
		Animal a1 = new Chat("Medor", 5);
		a1.afficher();
		a1.crier();
	}
}
