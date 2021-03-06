package Personnage;

import Capacité.LesCapacites;
import Capacité.etat;

public interface IPersonnage  {
    ////////////////// GETTER AND SETTER ///////////
    int getPoint_Mana();
    void setPoint_Mana(int point_Mana);
    int getIntelligence();
    void setIntelligence(int intelligence);
    int getForce();
    void setForce(int force);
    int getAgile();
    void setAgile(int agile);
    int getResPhysique();
    void setResPhysique(int resPhysique);
    etat getEtat();
    void setEtat(Capacité.etat etat);
    Boolean getVivant();
    void setVivant(Boolean vivant);
    int getPoint_vie();
    void setPoint_vie(int point_vie);
    int getResMagic();
    void setResMagic(int resMagic);
    LesCapacites[] getQuatreCapacite();
    long getId();
    //////////////////////// METHODE ///////////////
    void subirdegats(boolean capa , int degat);
    void isVivant(Personnage p);
    void recup();
    String toString();
    void Les4capacite(LesCapacites c ,int position);
    LesCapacites utilCapa(int numero);
    void remplirListCapacite(LesCapacites c);
    void monteeNiveau(int value, int value2);
    int nbcapacite();

}
