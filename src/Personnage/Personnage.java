package Personnage;
import Capacité.etat;
import Capacité.LesCapacites;
import Personnage.Monstre.AideFormation.EMosntre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Personnage implements  IPersonnage{
    ////////// ATTRIBUT ////////////
    private int point_vie;
    private int PV_MAX;
    private int point_Mana;
    private int MANA_MAX;
    private int intelligence;
    private int force;
    private int agile;
    private int resPhysique;
    private int resMagic;
    private etat etat;
    private Boolean vivant;
    List<LesCapacites> tout;
    private LesCapacites[] quatreCapacite;
    public ArrayList<LesCapacites> CapaciteTout = new ArrayList<LesCapacites>();
    private long id;
    private static long IDNEXT = 1l;
    ///////////////////CONSTRUCTEUR ////////////////////
    public Personnage(int point_vie, int point_Mana, int intelligence, int force, int agile, int resPhysique, int resMagic) {
        this.point_vie = point_vie;
        this.point_Mana = point_Mana;
        this.intelligence = intelligence;
        this.force = force;
        this.agile = agile;
        this.resPhysique = resPhysique;
        this.resMagic = resMagic;
        this.etat = Capacité.etat.NORMAL;
        this.vivant = true;
        this.PV_MAX = point_vie;
        this.MANA_MAX = point_Mana;
        List<LesCapacites> capa =  Arrays.asList(LesCapacites.values());
        CapaciteTout.addAll(capa);
        this.id = IDNEXT;
        IDNEXT++;
        quatreCapacite = new LesCapacites[]{null, null, null, null};
    }
    ///////  Le personnage test ///////
    public Personnage(){
        this.point_vie = 15;
        this.point_Mana = 10;
        this.force = 15;
        this.intelligence = 15;
        this.id = IDNEXT;
        IDNEXT++;
        this.etat = Capacité.etat.NORMAL;
        this.vivant = true;
        this.resMagic = 1;
        this.resPhysique = 1;
        this.agile = 9;
    }
    ////////////////// GETTER AND SETTER ///////////
    public int getPoint_Mana() {
        return point_Mana;
    }
    public void setPoint_Mana(int point_Mana) {
        this.point_Mana = point_Mana;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getForce() {
        return force;
    }
    public void setForce(int force) {
        this.force = force;
    }
    public int getAgile() {
        return agile;
    }
    public void setAgile(int agile) {
        this.agile = agile;
    }
    public int getResPhysique() {
        return resPhysique;
    }
    public void setResPhysique(int resPhysique) {
        this.resPhysique = resPhysique;
    }
    public etat getEtat() {
        return etat;
    }
    public void setEtat(etat etat) {
        this.etat = etat;
    }
    public Boolean getVivant() {
        return vivant;
    }
    public void setVivant(Boolean vivant) {
        this.vivant = vivant;
    }
    public int getPoint_vie() {
        return point_vie;
    }
    public void setPoint_vie(int point_vie) {
        this.point_vie = point_vie;
    }
    public int getResMagic() {
        return resMagic;
    }
    public void setResMagic(int resMagic) {
        this.resMagic = resMagic;
    }
    public int getPV_MAX() {
        return PV_MAX;
    }
    public int getMANA_MAX() {
        return MANA_MAX;
    }
    public void setPV_MAX(int value) {
        PV_MAX = value;
    }
    public void setMANA_MAX(int value) {
        MANA_MAX = value;
    }
    public long getId() {
        return id;
    }
    public LesCapacites[] getQuatreCapacite() {
        return quatreCapacite;
    }

    //////////////////////// METHODE /////////////////////
    public String toString(){
        return "PV[" + getPoint_vie() + "/" + getPV_MAX() + "], PM[" + getPoint_Mana() + "/" + getMANA_MAX() + "]";
    }
    public String toString2() {
        return ", PV [" + point_vie + "]"+
                ", PM [" + point_Mana + "]"+
                ", I [" + intelligence + "]"+
                ", F [" + force + "]"+
                ", A [" + agile + "]"+
                ", RP [" + resPhysique + "]"+
                ", RM [" + resMagic + "]"+
                ", statut [" + etat + "]";
    }
    public void monteeNiveau(int value, int value2){
        setMANA_MAX(value);
        setPV_MAX(value2);
    }
    public void Les4capacite(LesCapacites c, int position){
        quatreCapacite[position] = c;
    }
    public void remplirListCapacite(LesCapacites c){
        CapaciteTout.add(c);
    }
    public LesCapacites utilCapa(int numero){
        return quatreCapacite[numero];
    }
    public void subirdegats(LesCapacites capa, int degat){
        if(capa.isGenre()){
            degat = degat - getResMagic();
            int pvrestant = getPoint_vie();
            pvrestant = pvrestant - degat;
            setPoint_vie(getPoint_vie() - degat);
        }else{
            degat = degat - getResPhysique();
            int pvrestant = getPoint_vie();
            pvrestant = pvrestant - degat;
            setPoint_vie(getPoint_vie() - degat);
        }
    }
    public void isVivant(Personnage p){
        if(p.getPoint_vie() < 0){
            p.setVivant(false);
            p.setEtat(Capacité.etat.MORT);
        }else if (p.getPoint_vie() >= 20 ){
            System.out.println("Toujours vivant(e)");
            p.setEtat(Capacité.etat.FORT);
        }else if (p.getPoint_vie() < 5){
            System.out.println("Toujours vivant(e)");
            p.setEtat(Capacité.etat.FAIBLE);
        }else{
            System.out.println("Toujours vivant(e)");
            p.setEtat(Capacité.etat.NORMAL);
        }
    }
    public void recup(){
        setPoint_vie(getPV_MAX());
        setPoint_Mana(getMANA_MAX());
    }
    public int nbcapacite(){
        int nb = 0;
        for (LesCapacites lesCapacites : quatreCapacite) {
            if (lesCapacites != null) {
                nb++;
            }
        }
        return nb;
    }
}
