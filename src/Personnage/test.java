package Personnage;

import Capacité.LesCapacites;
import Capacité.etat;
import Donjon.Salle.NatureElement;
import Outils.Arme;
import Outils.Armure;
import Personnage.Hero.Hero;
import Personnage.Monstre.AideFormation.EMosntre;
import Personnage.Monstre.AideFormation.NomMonstre;
import Personnage.Monstre.CreationMonstre;
import Personnage.Monstre.Monstre;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

       /*Personnage p = new Personnage(15,15,15,15,15,15,15);

        for (LesCapacites a : p.CapaciteTout) {
            System.out.println(a);
        }*/


       CreationMonstre c = new CreationMonstre(1,2,NatureElement.EAU,2);

        /*Monstre m = new Monstre(1,1,1,1,1,1,1,1,EMosntre.DRAGON,NatureElement.FEU,NomMonstre.A,true,1);

        for (LesCapacites ca : m.CapaciteTout) {
            System.out.println(ca);
        }
        for (int a : m.quatreCapacite){
            System.out.println(a);
        }*/

         Monstre e = c.formationMonstre();
        for (LesCapacites a2: e.CapaciteTout) {
            System.out.println(a2);
        }
        for(int a3 : e.quatreCapacite){
            System.out.println(a3);
        }
        System.out.println(e.toString());

       /* CreationMonstre c = new CreationMonstre(5,1, NatureElement.POUSSIERE,3);
        CreationMonstre c2 = new CreationMonstre(5,3, NatureElement.TERRE,15);
        CreationMonstre c3 = new CreationMonstre(5,8, NatureElement.FOUDRE,15);
        c.hello();
        System.out.println();
        c.hello();
        System.out.println();
        c.hello();
        System.out.println();
        c.hello();
        System.out.println();
        c.hello();
        System.out.println();c.hello();
        System.out.println();

        c.listeration(); */

    }

}
