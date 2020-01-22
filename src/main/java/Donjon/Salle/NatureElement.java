package Donjon.Salle;

public enum NatureElement {

    FEU       ("feu"),
    EAU       ("eau"),
    SACRER    ("sacré"),
    TERRE     ("terre"),
    FOUDRE    ("Foudre"),
    NATUREL   ("normal"),
    POISON    ("poison"),
    ACIDE     ("acide"),
    CONTROLER ("dompté"),
    POUSSIERE ("poussière"),
    FROMAGE   ("fromage");

    private String nom;

    NatureElement(String nom){
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
}
