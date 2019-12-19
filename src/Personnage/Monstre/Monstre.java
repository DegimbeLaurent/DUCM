package Personnage.Monstre;

//C:\Users\Student\AppData\Roaming\VisualParadigm\ws

import Capacité.etat;
import Donjon.Salle.NatureElement;
import Personnage.*;

public class Monstre extends Personnage implements IPersonnage {

    private int charisme;
    private boolean dompter;
    private boolean vol;
    private NatureElement natType;
    private double ratio;
    private double ratioAppa;
    private String nom;

    public Monstre(int point_vie, int point_Mana, int intelligence, int force, int agile, int resPhysique, int resMagic,
                   Capacité.etat etat, Boolean vivant, int charisme, boolean dompter, boolean vol, NatureElement natType,
                   double ratio, double ratioAppa, String nom) {
        super(point_vie, point_Mana, intelligence, force, agile, resPhysique, resMagic, etat, vivant);
        this.charisme = charisme;
        this.dompter = dompter;
        this.vol = vol;
        this.natType = natType;
        this.ratio = ratio;
        this.ratioAppa = ratioAppa;
        this.nom = nom;
    }
}
