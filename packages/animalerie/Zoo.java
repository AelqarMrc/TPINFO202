package animalerie;

public class Zoo implements IZoo{
	
	//attributs
	private static Animal[] Cage;
	private Animal[] animal;
	
	//constructeur par defaut qui cree un zoo de n taille compris entre 10 et 20
	public Zoo(){
		int taille = (int)(Math.random()*11)+10;
		this.Cage = new Animal[taille];
	}
	
	//ajouter un animal
	public void ajouterAnimal(Animal a, int i){
		if(i>-1 && i<Cage.length-1){
			this.Cage[i] = a; 
		}
	}
	
	//getter
	public Animal getAnimal(int i){
		return Cage[i]; 
	}
	
	//supprimer un animal
	public void supprimerAnimal(int i){
		this.Cage[i] = null;
	}
	
	//methode crier
	public void faireCrier(){
		for (int i = 0; i < Cage.length; i++){
			Cage[i].crier();
		}
	}
	
	//methode toString
	public String toString(){
	
		String string = "";
		for (int i = 0; i < Cage.length; i++){
			string += Cage[i].toString();
		}
		return string;
	}
	
}
