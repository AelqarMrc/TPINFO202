package animalerie;

public class Animal implements IAnimal{
	private String nom;
	private int nbPattes;
	
	//initialisation
	public Animal(String n, int p){
		this.nom = n;
		this.nbPattes = p;
	}
	
	//getters 
	public String getNom(){return this.nom;}
	public int getNbPattes(){return this.nbPattes;}
	
	//setters 
	public void setNom(String n){this.nom = n;}
	
	//methode Crier()
	public void crier(){
		System.out.println("hum hum");
	}
	
	//methode toString et afficher
	
	public String toString(){
		return this.getNom()+", animal a "+this.getNbPattes();
	}
	
	public void afficher(){
		System.out.println(toString());
	}
	
}
