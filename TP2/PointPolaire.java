class PointPolaire implements IPoint{
	// attributs 
	private double distance;
	private double angle;

	
	// constructeur par init
	public PointPolaire(double distance, double angle){
		this.distance = distance;
		this.angle = angle;
	}
	
	// constructeur par défaut
	public PointPolaire(){
		this.distance = 0;
		this.angle = 0;
	}
	// constructeur par copie
	public PointPolaire(PointPolaire p){
		this.distance = p.distance;
		this.angle = p.angle;
	}
	
	// ajout getter 
	public double getX(){return distance*Math.cos(angle);}
	public double getY(){return distance*Math.sin(angle);}
	
	// ajout setter 
	public void setDistance(double distance){this.distance = distance;}
	public void setAngle(double angle){this.angle = angle;}
	
	//methode 
}
