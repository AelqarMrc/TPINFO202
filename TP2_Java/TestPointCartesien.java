import java.util.Scanner;

class TestPointCartesien{
	public static void main(String[] args){
		Scanner clavier = new Scanner(System.in);
		
		double x=clavier.nextDouble();
		double y=clavier.nextDouble();
		
		PointCartesien p1 = new PointCartesien(x,y);
		
		double distanceO = p1.distance(p1);
		System.out.println(distanceO);
		p1.afficher();
	}
}
