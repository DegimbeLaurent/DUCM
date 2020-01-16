package Capacité;

import Donjon.Salle.NatureElement;

public enum etat {

    NORMAL(NatureElement.NATUREL, "Normal"),
    MORT(NatureElement.POUSSIERE,"Mort"),
    FAIBLE(NatureElement.NATUREL,"Affaibli"),
    FORT(NatureElement.NATUREL,"Plein Forme"),
    BRULER(NatureElement.FEU, "Brulé(e)"),
    GELER(NatureElement.EAU,"Gelé(e)"),
    FOU(NatureElement.FROMAGE,"Troublé(e)"),
    CONTROLER(NatureElement.CONTROLER,"Dompter");

    private NatureElement nature;

    etat(NatureElement nature, String nom){

    }

}
