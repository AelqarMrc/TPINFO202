import animalerie.*;

public class TestZoo{
	
	public static void main (String[] args){
		Animal a0 = new Chat("num0", 5);
		Animal a1 = new Chat("num1", 5);
		Animal a2 = new Chat("num2", 5);
		Animal a3 = new Chat("num3", 5);
		
		Zoo z = new Zoo();
		
		for (int i = 0; i<z.length; i++){
			z.ajouterAnimal(ai, i);
		}
	}
}
