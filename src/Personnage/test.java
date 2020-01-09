package Personnage;

import Capacité.LesCapacites;
import Capacité.etat;
import Donjon.Salle.NatureElement;
import Outils.Arme;
import Outils.Armure;
import Personnage.Hero.Hero;
import Personnage.Monstre.CreationMonstre;

public class test {

    public static void main(String[] args) {

        CreationMonstre c = new CreationMonstre(5,1, NatureElement.FROMAGE,15);
        CreationMonstre c2 = new CreationMonstre(5,3, NatureElement.FROMAGE,15);
        CreationMonstre c3 = new CreationMonstre(5,8, NatureElement.FROMAGE,15);
        c.hello();
        c2.hello();
        c3.hello();
    }

}
