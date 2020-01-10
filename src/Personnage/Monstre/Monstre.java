package Personnage.Monstre;

import Donjon.Salle.NatureElement;
import Personnage.*;
import Personnage.Monstre.AideFormation.EMosntre;
import Personnage.Monstre.AideFormation.NomMonstre;

public class Monstre extends Personnage implements IPersonnage {

    private int charisme;
    private boolean dompter;
    private NatureElement natType;
    private boolean vol;
    private String nom;
    private String race;

    public Monstre(int point_vie, int point_Mana, int intelligence, int force, int agile, int resPhysique, int resMagic,
                   int charisme, EMosntre lemonstre, NatureElement natType, NomMonstre nomMonstre) {
        super(point_vie, point_Mana, intelligence, force, agile, resPhysique, resMagic);
        this.charisme = charisme;
        this.dompter = false;
        this.natType = natType;
        this.nom = nomMonstre.getNom();
        this.vol = lemonstre.isVol();
        this.race = lemonstre.getRace();
    }

    public String toString() {
        return "Monstre {" +
                " Race: " + race +
                super.toString2() +
                ", CH [" + charisme +"]"+
                ", Dompté [" + dompter + "]"+
                ", Nature [" + natType + "]"+
                ", nom [ " + nom +
                "] }";
    }
}
