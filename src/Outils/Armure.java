package Outils;

import Capacité.etat;

public enum Armure {

    ARMURE_CUIR  (1,"Armure du loup pauvre"   ,1,false,"torse" , Capacité.etat.NORMAL ,0, new int[]{52}),
    CAPE_DE_CUIR (2,"cape du débutant pauvre" ,0,false,"dos"   , Capacité.etat.NORMAL ,0, new int[]{54}),
    PANTALON     (3,"Pantalon de lin"         ,0,false,"jambe" , Capacité.etat.NORMAL ,0, new int[]{50});



    private String nom;
    private int id;
    private boolean genre; // false = physique et true = magic
    private int[] composant;
    private int resistance;
    private String zone;
    private int niveauMin;
    private Capacité.etat etat;

    Armure(int id, String nom, int resistance, boolean genre, String zone, etat etat , int niveauMin, int[] composant){
        this.id = id;
        this.nom = nom;
        this.resistance = resistance;
        this.genre = genre;
        this.zone = zone;
        this.niveauMin = niveauMin;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public boolean isGenre() {
        return genre;
    }

    public int[] getComposant() {
        return composant;
    }

    public int getResistance() {
        return resistance;
    }

    public String getZone() {
        return zone;
    }

    public int getNiveauMin() {
        return niveauMin;
    }

    public Capacité.etat getEtat() {
        return etat;
    }
}
