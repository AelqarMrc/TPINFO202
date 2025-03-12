public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private double poids;
    private String taille;
    private Civilite civ;


    //constructeur par init 
    public Personne (String n, String p, int a, double pds, String t, Civilite c){
        nom = n;
        prenom = p;
        age = 0; 
        if(age>=0) age=a;
        poids = pds;
        taille = t;
        civ = c;
    }

    //construcuteur par défaut
    public Personne (){
        this("DUPONT","Jean",50,75.0,"1m80",Civilite.M);

    }

    //ajout getter
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public int getAge(){return age;}
    public double getPoids(){return poids;}
    public String getTaille(){return taille;}
    public Civilite getCiv(){return civ;}

    //ajout setter
    public void setNom(String nom){this.nom = nom;}
    public void setPrenom(String prenom){this.prenom = prenom;}
    public void setAge(int age){this.age = age;}
    public void setPoids(double poids){this.poids = poids;}
    public void setTaille(String taille){this.taille = taille;}
    public void setCivilite(Civilite civ){this.civ = civ;}

    //methode toString et afficher
    public String toString(){
        return civ.toString()+"."+prenom+" "+nom+" : "+age+" ans, "+taille+", "+poids+"kg";
    }

    public void afficher(){
        System.out.println(toString());
    }

    
    
}