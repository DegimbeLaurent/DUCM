package Personnage.Monstre.AideFormation;

import Donjon.Salle.NatureElement;

public enum EMosntre {
    DRAGON       (true ,1,"Dragon"),
    LEVIATHAN    (false,1,"Léviathan"),

    DRAGONT       (false,2,"Dragon Terrestre"),
    GOLEM        (false,2,"Golem"),
    TROLL        (false,2,"Troll"),

    GOLEMAILEE   (true ,3,"Golem volant"),
    WYVERNE      (true,3,"Wyverne à 4 ailes"),

    LICHE        (false,4,"Liche"),
    ARMUREMAGIQUE(false,4,"Armure maudite"),

    AIGLEGEANT   (true,5,"Aigle Céleste"),
    OURSGEANT    (false,5,"Roi Ours"),

    ORC          (false,6,"Orc"),
    OURS         (false,6,"Ours des montagnes"),

    LOUPS        (false,7,"Loups"),
    AIGLE        (true,7,"Aigle charognard"),

    MAGESQUELETTE(false,8,"Squelette mage"),
    OEILMALEFIQUE(true,8,"Oeil maudit "),

    GOBELIN      (false,9,"Gobelin"),
    CADAVRE      (false,9,"Zombie faible"),

    SLIME        (false,10,"Slime"),
    HOMMERAT     (false,10,"Homme-rat");

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
/* apparition :     1  monstre F , R , I , A , RA Mytique

                    2  monstre F,R, i,a,ra  Résistance physique

                    3 monstre  RA,A i,f,r Résistance magic et vitesse

                    4 monstre RA, I , f , r , ra magic au rang

                    5 monstre A , F , r , ra ,i

                    6 monstre F , a , r , ra , i

                    7 monstre A , f , r, ra , i

                    8 monstre I , f , r , ra , a magic bas rang

                    9 monstre  f, a ,r ,ra ,i   monstre commun

                    10 monstre f , a , r , ra , i  monstre faible

                    0 Boss F, R , I , A , RA mais varie avec niv sinon idem

     */