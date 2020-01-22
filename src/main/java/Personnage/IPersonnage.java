package Personnage;

import Capacite.Etat;
import Capacite.LesCapacites;

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
    Etat getEtat();
    void setEtat(Capacite.Etat etat);
    Boolean getVivant();
    void setVivant(Boolean vivant);
    int getPoint_vie();
    void setPoint_vie(int point_vie);
    int getResMagic();
    void setResMagic(int resMagic);
    int[] getQuatreCapacite();
    long getId();
    //////////////////////// METHODE ///////////////
    void subirdegats(LesCapacites capa);
    void isVivant();
    void recup();
    String toString();
    void Les4capacite(LesCapacites c ,int position);
    int utilCapa(int numero);
    void monteeNiveau(int value, int value2);
    int nbcapacite();
}
