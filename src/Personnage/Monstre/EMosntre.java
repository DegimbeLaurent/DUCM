package Personnage.Monstre;

import Donjon.Salle.NatureElement;
import Personnage.Personnage;

public enum EMosntre {

    GOBELIN   (false,7,"Gobelin"),

    ORC       (false,5,"Orc"),

    TROLL     (false,3,"Troll"),

    SLIME     (false,9,"Slime"),

    DRAGON    (true ,1,"Dragon"),

    GOLEM     (false,2,"Golem"),

    GOLEMAILEE(true ,1,"Golem volant"),

    LOUPS     (false,8,"Loups");


    private boolean vol;
    private int ratioApparition;
    private String race;
    EMosntre(boolean vol, int ratioApparition, String race){
        this.vol = vol;
        if( ratioApparition < 11 ) {
            this.ratioApparition = ratioApparition;
        }
        this.race = race;
    }
    public String getRace() {
        return race;
    }
    public boolean isVol() {
        return vol;
    }
    public int getRatioApparition() {
        return ratioApparition;
    }
}
