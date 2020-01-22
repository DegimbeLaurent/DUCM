package Personnage.Monstre;

import Donjon.Salle.NatureElement;
import Personnage.Monstre.AideFormation.EMosntre;
import Personnage.Monstre.AideFormation.Loi_des_stats_Monstre;
import Personnage.Monstre.AideFormation.NomMonstre;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CreationMonstre  {

    private int           nivMonstre ;
    private int           nbMonstre ;
    private NatureElement element;
    private NomMonstre    nom;
    private int           valeurDeLaSalle;
    private List<EMosntre> lesMonstre    = new ArrayList<EMosntre>();
    private List<EMosntre> MonstreChoisi = new ArrayList<EMosntre>();

    public  CreationMonstre (int nbMonstre , int nivMonstre , NatureElement element, int valeurDeLaSalle){
        this.nbMonstre = nbMonstre;
        this.nivMonstre = nivMonstre;
        this.element = element;
        this.valeurDeLaSalle = valeurDeLaSalle;
        List<EMosntre> myEnums = Arrays.asList(EMosntre.values());
        lesMonstre.addAll(myEnums);
    }
    public  Monstre   formationMonstre() {
            int c = valeurApparitionM();
            if(c <= 0 ){
                return null;
            }else {
                EMosntre m = unMonstre(c);
                Loi_des_stats_Monstre loi = new Loi_des_stats_Monstre(nivMonstre);

                return new Monstre(loi.PointVitaux(m), loi.pointDeMana(m), loi.statIntel(m)

                        , loi.statforce(m), loi.statAgile(m), loi.statR(m)

                        , loi.statRMagic(m), loi.restcharisme(m), m, element, NomMonstre.A,m.isMagic(),nivMonstre);
            }
    }
    private EMosntre unMonstre(int c){
        EMosntre m;
        for ( EMosntre n : lesMonstre) {
            if(n.getRatioApparition() == c){
                MonstreChoisi.add(n);
            }
        }
        m = MonstreChoisi.get(ThreadLocalRandom.current().nextInt(0, MonstreChoisi.size()));
        MonstreChoisi.clear();
        return m;
    }
    private int      valeurApparitionM (){
        int c;
            Random r = new Random();
            c = r.nextInt(10) + 1;
            valeurDeLaSalle =- c;
        return c;
    }
    private int      bossDonjon        (){
        return 0;
    }
}
