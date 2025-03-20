class PointCartesien implements IPoint{
	private double x;
	private double y;
	
	//constructeur par init
	public PointCartesien(double x, double y){
		this.x = x;
		this.y = y;
	}
	//constructeur par défaut
	public PointCartesien(){
		x=0;
		y=0;
	}
	//constructeur par copie
	public PointCartesien(PointCartesien p){
		this.x = p.x;
		this.y = p.y;
	}
	//ajout getter
	public double getX(){return x;}
	public double getY(){return y;}
	
	//setter 
	public void setX(double x){this.x=x;}
	public void setY(double y){this.y=y;}
	
	//calcul distance à l'origine
	public double distance(){
		return (this.x*this.x)+(this.y*this.y);
	}
	
	//calcul distance entre 2 points
	public double distance(IPoint p){
		double a = (p.getX()-this.x);
		double b = (p.getY()-this.y);
		double distance = (a*a)+(b*b);	
		return distance;
	}	
	
	//methode toString et afficher 
	public String toString(){
		return "A("+x+","+y+")";
	}
	
	public void afficher(){
		System.out.println(toString());
	}
	
	
}	
