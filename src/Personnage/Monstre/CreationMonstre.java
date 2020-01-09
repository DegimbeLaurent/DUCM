package Personnage.Monstre;

import Donjon.Salle.NatureElement;
import Personnage.Monstre.AideFormation.Loi_des_stats_Monstre;
import Personnage.Monstre.AideFormation.NomMonstre;

public class CreationMonstre  {

    private int nivMonstre ;
    private int nbMonstre ;
    private NatureElement element;
    private NomMonstre nom;
    private int valeurDeLaSalle;

    public CreationMonstre(int nbMonstre , int nivMonstre , NatureElement element, int valeurDeLaSalle){
        this.nbMonstre = nbMonstre;
        this.nivMonstre = nivMonstre;
        this.element = element;
        this.valeurDeLaSalle = valeurDeLaSalle;
    }

    public Monstre formationMonstre() {
        // faire le choix avec le taux d'apparition
        EMosntre m = EMosntre.GOBELIN;

        Loi_des_stats_Monstre loi = new Loi_des_stats_Monstre(nivMonstre);
        Monstre n = new Monstre(loi.PointVitaux(m),loi.pointDeMana(m),loi.statIntel(m)
                ,loi.statforce(m),loi.statAgile(m),loi.statR(m)
                ,loi.statR(m),loi.restcharisme(m),m,element,NomMonstre.A);
        return n;
    }

    public void hello(){
        System.out.println(nbMonstre +" est le nombre de monstre et " + nivMonstre +" est le niv des monstre " + element);
        Monstre a = formationMonstre();
        System.out.println(a.toString());
    }

}
