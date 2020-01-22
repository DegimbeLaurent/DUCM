package Capacite;

import Donjon.Salle.NatureElement;

public enum Etat {

    NORMAL(NatureElement.NATUREL, "Normal"),
    MORT(NatureElement.POUSSIERE,"Mort"),
    FAIBLE(NatureElement.NATUREL,"Affaibli"),
    FORT(NatureElement.NATUREL,"Plein Forme"),
    BRULER(NatureElement.FEU, "Brulé(e)"),
    GELER(NatureElement.EAU,"Gelé(e)"),
    FOU(NatureElement.FROMAGE,"Troublé(e)"),
    CONTROLER(NatureElement.CONTROLER,"Dompter");

    private NatureElement nature;
    private String nom;

    Etat(NatureElement nature, String nom){
        this.nom = nom;
        this.nature = nature;
    }

    public NatureElement getNature() {
        return nature;
    }

    public String getNom() {
        return nom;
    }
}
