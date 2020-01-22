package Personnage.Monstre.AideFormation;

public enum NomMonstre {

    A("Aaaargh"),
    B("Baaargh");



    private String nom;
    NomMonstre(String nom){
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
}
