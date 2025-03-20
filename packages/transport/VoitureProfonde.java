package transport;
import personne.Personne;
public class VoitureProfonde implements IVoiture{
	
	// ATTRIBUTS
	private Moteur moteur;
	private Reservoir reservoir;
	private Couleur coul;
	private Personne conducteur;
	
	// CONSTRUCTEUR 
	public VoitureProfonde(Moteur m, Reservoir r){
		moteur = new Moteur(m);
		reservoir = new Reservoir(r);
		this.conducteur = null;
	}
	// PAR COPIE
	public VoitureProfonde(VoitureProfonde v){
		this(v.moteur, v.reservoir);
	}
	
	//GETTERS
	public Moteur getMoteur(){return this.moteur;}
	public Reservoir getReservoir(){return this.reservoir;}	
	public double getContenuReservoir(){return reservoir.getContenu();}
	public Personne getConducteur(){return this.conducteur;}
	
	//SETTERS 
	public void setConducteur(Personne conducteur){
		if (conducteur.getAge() < 18){
			this.conducteur = null;	
		}
		else{
			this.conducteur = conducteur;		
		}
	}
	
	// METHODE
	
	//AVANCER
	public double avancer(double distance){
		double result = 0;
		double res = getContenuReservoir();
		double cons = moteur.getConsommation();
		
		//Essence necessaire pour parcourir la distance demande
		double cap = (distance*cons)/100;
		
		//Si la cap du reservoir < cap necessaire; return la distance parcourable avec la capacite du reservoir 
		
		if (res<cap){
			result = (res*100)/cons; 
		}
		//Sinon return la distance
		else {
			result = distance;
		}
		 
		return res;
	}
	
	public double faireLePlein(){
		return reservoir.getCapacite();
	}
	
	
	
	
}
