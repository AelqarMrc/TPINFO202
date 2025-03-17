public class Distributeur implements IDistributeur{
	
	//attributs
	private double capacite;
	private int nbDosette;
	private double reservoir;
	private double cagnotte;
	
	//attributs de classe
	private static double prixCourt = 0.50;
	private static double prixLong = 0.70;
	private static double cafeCourt = 25;	//valeur de stockage en CL
	private static double cafeLong = 10;	//valeur de stockage en CL
	
	//constructeur
	public Distributeur(double cap, int n, double r, double c){
		capacite = cap;
		nbDosette = n;
		reservoir =  r;
		cagnotte = c;
	}
	
	public Distributeur(){
		capacite = 0;
		nbDosette = 0;
		reservoir = 0;
		cagnotte = 0;
	}
	
	//getters 
	public double getCap(){return this.capacite;}
	public int getN(){return this.nbDosette;}
	public double getr(){return this.reservoir;}
	public double getC(){return this.cagnotte;}
	
	public static double getPrixCourt(){return prixCourt;}
	public static double getPrixLong(){return prixLong;}
	public static double getCafeCourt(){return cafeCourt;}
	public static double getCafeLong(){return cafeLong;}
	
	//setters 
	public static void setPrixCourt(double montant){prixCourt = montant;}
	public static void setPrixLong(double montant){prixLong = montant;}
	
	//methode toString et afficher
	public String toString(){
		//c'est l affichage on verra apres c pas le plus important
		return "";
	}
	public void afficher(){
		System.out.println(toString());
	}
	
	//methode boire cafe court
	public double boireCafeCourt(double monnaie){
		System.out.println("Boire un cafe court");
		return monnaie - prixCourt;
	}
	
	//methode boire cafe long
	public double boireCafeLong(double monnaie){
		System.out.println("Boire un cafe long");
		return monnaie - prixLong;
	}
	
	//methode ajouter dosettes
	public void ajouterDosettes (int nbDosettes){
		this.nbDosette = nbDosettes;
	}
	
	//methode remplir reservoir 
	public void remplirReservoir(double quantite){
		this.reservoir = quantite;
	}
	
}
