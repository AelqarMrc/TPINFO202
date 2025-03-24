package animalerie;

public class Chat extends Mammifere{
	
	public Chat(String nom, int nbPattes){
		super(nom, 4);
	}
	
	public String toString(){
		return "Chat "+this.getNom()+", mammifere a "+this.getNbPattes();
	}
	
	public void crier(){
		System.out.println("miaou, miaou");
	}
}
