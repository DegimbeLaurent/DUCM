package Personnage.Hero;

import Capacité.etat;
import Personnage.Personnage;

public class Hero extends Personnage implements IHero{
    private int niveau;
    private int endurance;
    private int endMax;
    private int chance;
    private int experience;
    private int expNiv;
    private final int limiteNiv = 10;

/////////////////// Construction /////////////////////
    public Hero(int point_vie, int point_Mana, int intelligence, int force, int agile, int resPhysique, int resMagic, Capacité.etat etat, Boolean vivant,int endurance,int chance) {
        super(point_vie, point_Mana, intelligence, force, agile, resPhysique, resMagic, etat, vivant);
        this.chance = chance;
        this.endurance = endurance;
        this.experience = 0;
        this.endMax = endurance;
        this.niveau = 1;
        this.expNiv= ( niveau * 10 ) * ( 10 / niveau );
    }
////////////////// Getter & setter //////////////////
    public int getEndurance() {
        return endurance;
    }
    public void setEndurance(int end) {
        this.endurance = end;
    }
    public int getChance() {
        return chance;
    }
    public void setChance(int ch) {
        this.chance = ch;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int a) {
        this.experience = a;
    }
    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int a) {
        this.niveau = a;
    }
    public int getExpniv() {
        return expNiv;
    }
    public void setExpniv(int expniv) {
        this.expNiv= expniv;
    }
    public int getEndmax() {
        return endMax;
    }
    public void setEndmax(int value) {
        this.endMax = value;
    }
    public void gainExp(int value){
        System.out.println(" Vous gagnez de l'expérience: " + value + " exp");
        int exp = getExperience() + value;
        setExperience(exp);
    }
    public String statut() {
        return " est dans l'état " + getEtat() + " stat: " + super.toString() + ", PE[" + getEndurance() + "/"+ getEndmax() +"], exp["+ getExperience() +"/"
                + getExpniv() + "]";
    }
    public void perteEnd() {
        int action = getEndurance() - 1;
        setEndurance(action);
    }
    public void gainEnd(int gain) {
        int end = gain + getEndurance();
        setEndurance(Math.min(end, getEndmax()));
    }
    public void monterLvl(){
        if(limiteNiv > niveau) {
            if (getExperience() >= getExpniv()) {
                int exprestante = getExperience() - getExpniv();
                setExperience(exprestante);
                int niv = getNiveau() + 1;
                setNiveau(niv);
                niv = ( niv *(10 - niv)) * ( 10 + niv  );
                setExpniv(niv);
                System.out.println("Montée de niveau");
            }else{
                System.out.println("Pas assez d'expérience pour passer au niveau suivant");
            }
        }else{
            System.out.println("Niveau Max");
        }
    }
    public void recupHop(){
        super.recup();
        setEndurance(getEndmax());
    }
    public void recupstat(){
         genererStat(getPoint_vie(),getPV_MAX());
         genererStat(getPoint_Mana(),getMANA_MAX());
         genererStat(getEndurance(),getEndmax());
    }
    public void genererStat(int pstat, int mx) {
        int moitie = mx - pstat;
        moitie = moitie / 2 + pstat;
        setPoint_vie(moitie);
    }
 ///////////////////////////////////////////////////////
    public void ajouterArmure() {

    }
    public void ajouterArme() {

    }
}
