enum Civilite{
    // MONSIEUR("M"),
    // MADAME("Mme"),
    // MADEMOISELLE("Mlle");
    M("M"),
    Mme("Mme"),
    Mlle("Mlle");
    
    //attribut 
    private String abreviation = " ";

    //constructeur
    Civilite(String ab){
        abreviation = ab;
    }
    //methode
    public String tostring(){
        return abreviation;
    }
}


