package Capacité;

public enum LesCapacites {

    BOULEDEFEU    (1, 1,"Boule de Feu",    3,true, 1,1,"e","feu",    "g", true ),
    BOULEDEGLACE  (2, 1,"Boule de Glace",  3,true, 1,1,"e","glace",  "g", true ),
    BOULEDEVENT   (3, 1,"Boule de Vent",   3,true, 1,1,"e","vent",   "g", true ),
    BOULEDETERRE  (4, 1,"Balle de Terre",  3,true, 1,1,"e","terre",  "g", true ),
    BOULEDEAU     (5, 1,"Boule de eau",    3,true, 1,1,"e","eau",    "g", true ),
    BOULEDETENEBRE(6, 1,"Boule de ténèbre",3,true, 1,1,"e","tenebre","g", true ),
    ONDEFOLIE     (7, 2,"Vague de folie",  2,true, 1,1,"e","normal", "m", false),
    COUPDANSLEDOS (8, 1,"Coup dans le dos",4,false,1,1,"e","normal", "g", false),
    BOUCLIERSACRE (9, 1,"Bouclier Sacré",  3,false,1,1,"a","sacré",  "h", true ),
    FLECHEMORTEL  (10,1,"Flèche de batard",2,true, 1,1,"e","normal", "g", true),
    SOINDIVIN     (11,2,"Soin de Dieu ",   6,true, 1,1,"a","soin",   "h", true ),
    DANSEEROTIQUE (12,2,"Danse Erotique",  1,true, 1,4,"a","normal", "h", false),
    MORSURE       (13,1,"Morsure"         ,2,false,1,1,"e","normal", "m", false);

    // ///// / / / // ATTRIBUT / / / / / / / / / / / //  // /
    private int id;
    private int niveau;
    private String nom;
    private int degats;
    private boolean distance;
    private int longueur;
    private int nbCible;
    private String cible;
    private String etat;
    private String type;
    private boolean genre;
    /////////////////  constructeur emun
    LesCapacites(int id, int niveau, String nom, int degats, boolean distance, int longueur, int nbCible, String cible, String etat, String type, boolean genre) {
        this.id = id;
        this.nom = nom;
        this.degats = degats;
        this.distance = distance;
        this.longueur = longueur;
        this.nbCible = nbCible;
        this.cible = cible;
        this.etat = etat;
        this.type = type;
        this.genre = genre;
    }
    ////////////// GETTER /////////////
    public int getId() {
        return id;
    }
    public int getNiveau() {
        return niveau;
    }
    public String getNom() {
        return nom;
    }
    public int getDegats() {
        return degats;
    }
    public boolean isDistance() {
        return distance;
    }
    public int getNbCible() {
        return nbCible;
    }
    public String getCible() {
        return cible;
    }
    public String getEtat() {
        return etat;
    }
    public String getType() {
        return type;
    }
    public int getLongueur() {
        return longueur;
    }
    public boolean isGenre() {
        return genre;
    }
    public String toString(){
        return "Capacité [" + getNom() + "]";
    }
}
