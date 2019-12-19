package Outils;

import Capacité.etat;

import java.util.List;

public enum Arme {

    EPEE_COURTE   (1 , "épée courte"       ,2 , 3 , new int[]{1, 2},   Capacité.etat.NORMAL,   false,1, 2),
    EPEE_LONGUE   (2 , "épée longue"       ,2 , 4 , new int[]{1,3},    Capacité.etat.NORMAL,   false,2, 3),
    EPEE_FEU      (3 , "épée enflammée"    ,2 , 5 , new int[]{1,9,12}, Capacité.etat.BRULER ,  true ,1, 4),
    EPEE_GLACIAL  (4 , "épée glacée"       ,3 , 4 , new int[]{1,5,13}, Capacité.etat.GELER,    true ,1, 4),
    EPEE_MAUDITE  (5 , "épee maudite"      ,3 , 5 , new int[]{1,7},    Capacité.etat.FOU,      false,2, 5),
    EPEE_DEBUTANT (6 , "épée du jeune héro",1 , 2 , new int[]{2,9},    Capacité.etat.NORMAL,   false,1, 1);

    private int dmin;
    private int dmax;
    private String nom;
    private int[] composant;
    private Capacité.etat etat;
    private int id;
    private boolean genre; // false = physique , true = magic
    private int distance;
    private int main;
    private int niveauMin;
    List<Arme> listeArme;

    Arme(int id, String nom, int dmin, int dmax, int[] composant, etat etat, boolean genre, int main, int niveauMin){
        this.nom = nom;
        this.dmin = dmin;
        this.dmax = dmax;
        this.id = id;
        this.genre = genre;
        this.main = main;
    }
    public int getDmin() {
        return dmin;
    }
    public int getDmax() {
        return dmax;
    }
    public String getNom() {
        return nom;
    }
    public int[] getComposant() {
        return composant;
    }
    public Capacité.etat getEtat() {
        return etat;
    }
    public int getId() {
        return id;
    }
    public boolean isGenre() {
        return genre;
    }
    public int getMain() {
        return main;
    }
    public int getDistance() {
        return distance;
    }
    public int getNiveauMin() {
        return niveauMin;
    }
    public List<Arme> getListeArme() {
        return listeArme;
    }
/*
    public Arme rechercherArme(int a ){
        for (Arme ar : listeArme ) {
            if( ar.getId() == a ){
                return ar;
            }
        }
        return null;
    }
    */

}
