package animalerie;

public class Mammifere extends Animal{
	
	public Mammifere(String nom, int nbPattes){
		super(nom, 4);
	}
	
	public String toString(){
		return this.getNom()+", mammifere a "+this.getNbPattes();
	}
}
