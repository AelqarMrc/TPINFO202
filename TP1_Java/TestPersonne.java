import java.util.Scanner;

public class TestPersonne {    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        Personne p = new Personne("DUPONT","Jean",50,75.0,"1m80",Civilite.M);
        p.afficher();
    }
}
