package Personnage.Hero;

import Capacité.LesCapacites;
import Capacité.etat;
import Outils.Arme;
import Outils.Armure;
import Personnage.Personnage;

import java.util.ArrayList;
import java.util.Scanner;

public class Hero extends Personnage implements IHero{
    private int niveau;
    private int endurance;
    private int endMax;
    private int chance;
    private int experience;
    private int expNiv;
    private final int limiteNiv = 10;
    ArrayList<Arme> tabArme;
    ArrayList<Armure> tabArmure;

/////////////////// Construction /////////////////////
    public Hero(int point_vie, int point_Mana, int intelligence, int force, int agile, int resPhysique, int resMagic, Capacité.etat etat, Boolean vivant,int endurance,int chance) {
        super(point_vie, point_Mana, intelligence, force, agile, resPhysique, resMagic, etat, vivant);
        this.chance = chance;
        this.endurance = endurance;
        this.experience = 0;
        this.endMax = endurance;
        this.niveau = 1;
        this.expNiv= ( niveau * 10 ) * ( 10 / niveau );
        tabArme = new ArrayList<Arme>(2);
        tabArmure = new ArrayList<Armure>(5); // tete torse dos jambe pied
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
    public void statutArmer() {
        statut();
        System.out.println(" L'Uniforme");
        vueArmure();
        System.out.println(" Le(s) arme(s)");
        vueArme();
    }
    public void vueArme() {
        for (Arme ar: tabArme) {
            System.out.println("l'arme " + ar.getNom() + " degats :" + ar.getDmin() + " à " + ar.getDmax());
        }
    }
    public void vueArmure() {
        for (Armure ar: tabArmure) {
            System.out.println("l'arme " + ar.getNom() + " pour " + ar.getZone() + " protection de " + ar.getResistance());
        }
    }
    public void genererStat(int pstat, int mx) {
        int moitie = mx - pstat;
        moitie = moitie / 2 + pstat;
        setPoint_vie(moitie);
    }
 ///////////////////////////////////////////////////////
    public void ajouterArmure(Armure a) {
        if(a.getNiveauMin() < getNiveau()){
            switch (a.getZone()){
                case "tete":
                    System.out.println(" Le couvre-chefs, c'est la base ");
                    tabArmure.remove(rechercher("tete"));
                    tabArmure.add(a);
                    break;
                    case "torse":
                        System.out.println(" Cache ses poils");
                        tabArmure.remove(rechercher("torse"));
                        tabArmure.add(a);
                    break;
                    case "jambe":
                        System.out.println("Un peu de sport, c'esr pa.....");
                        tabArmure.remove(rechercher("jambe"));
                        tabArmure.add(a);
                    break;
                    case "dos":
                        System.out.println(" pour cacher ta bosse");
                        tabArmure.remove(rechercher("dos"));
                        tabArmure.add(a);
                        break;
                default:
                    System.out.println(" Mes pieds seront au sec");
                    tabArmure.remove(rechercher("pied"));
                    tabArmure.add(a);
            }
        }else{
            System.out.println("Niveau trop INFERIEUR");
        }
    }
    public void ajouterArme(Arme a) {
        if(a.getNiveauMin() <= getNiveau()){
            // supprimer a du sac inventaire
            if(mainArmer() < 2){
                if(a.getMain() < 2 ) {
                    armer(a);
                }else{
                    // ajouter les arme dans la main dans le sac
                    tabArme.clear();
                    armer(a);
                }
            }else{
                System.out.println(" Choisir une arme entre ");
                vueArme();
                Scanner s = new Scanner(System.in);
                String choix = s.nextLine();
                boolean choisir = true;
                do{
                   if(choix.equals("1")){
                       // ajouter tabArme.remove(0) au sac
                       tabArme.remove(0);
                       armer(a);
                    }else if( choix.equals("2")){
                       // ajouter tabArme.remove(1) au sac
                       tabArme.remove(1);
                       armer(a);
                   }else{
                       System.out.println("Euh 1 ou 2");
                       choix = s.nextLine();
                   }
                }while(choisir);
            }
        }else{
            System.out.println("Niveau trop INFERIEUR");
        }
    }
    public int mainArmer(){
        int a = 0;
        for (Arme ar: tabArme) {
            a += ar.getMain();
        }
        return a;
    }
    public void armer(Arme a){
        tabArme.add(a);
        System.out.println("Arme " + a.getNom() + " équipée");
    }
    public Armure rechercher(String zone){
        Armure a = null;
        for (Armure ar: tabArmure) {
            if( ar.getZone().equals(zone)){
                a = ar;
            }
        }
        return a;
    }

}
