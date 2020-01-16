package Personnage.Monstre.AideFormation;

import Donjon.Salle.NatureElement;

public enum EMosntre {
    DRAGON       (true ,1,"Dragon",true),
    LEVIATHAN    (false,1,"Léviathan",true),

    DRAGONT       (false,2,"Dragon Terrestre",true),
    GOLEM        (false,2,"Golem",false),
    TROLL        (false,2,"Troll",false),

    GOLEMAILEE   (true ,3,"Golem volant",true),
    WYVERNE      (true,3,"Wyverne à 4 ailes",true),

    LICHE        (false,4,"Liche",true),
    ARMUREMAGIQUE(false,4,"Armure maudite",true),

    AIGLEGEANT   (true,5,"Aigle Céleste",false),
    OURSGEANT    (false,5,"Roi Ours",false),

    ORC          (false,6,"Orc",false),
    OURS         (false,6,"Ours des montagnes",false),

    LOUPS        (false,7,"Loups",false),
    AIGLE        (true,7,"Aigle charognard",false),

    MAGESQUELETTE(false,8,"Squelette mage",true),
    OEILMALEFIQUE(true,8,"Oeil maudit ",true),

    GOBELIN      (false,9,"Gobelin",false),
    CADAVRE      (false,9,"Zombie faible",false),

    SLIME        (false,10,"Slime",true),
    HOMMERAT     (false,10,"Homme-rat",false);

    private boolean vol;
    private int ratioApparition;
    private String race;
    private boolean magic;
    EMosntre(boolean vol, int ratioApparition, String race, boolean magic){
        this.vol = vol;
        if( ratioApparition < 11 ) {
            this.ratioApparition = ratioApparition;
        }
        this.race = race;
        this.magic = magic;
    }
    public boolean isMagic() {
        return magic;
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