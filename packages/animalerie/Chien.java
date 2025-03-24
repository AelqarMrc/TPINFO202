package animalerie;

public class Chien extends Mammifere{
	
	public Chien(String nom, int nbPattes){
		super(nom, 4);
	}
	
	public String toString(){
		return "Chien "+this.getNom()+", mammifere a "+this.getNbPattes();
	}
	
	public void crier(){
		System.out.println("ouaf, ouaf");
	}
}
