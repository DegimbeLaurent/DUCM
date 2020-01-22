package Personnage;
import Capacite.Etat;
import Capacite.LesCapacites;

import java.util.ArrayList;

public  class Personnage implements  IPersonnage{
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
    private Etat etat;
    private Boolean vivant;
    protected int[] quatreCapacite = new int[4];
    protected ArrayList<LesCapacites> CapaciteTout = new ArrayList<LesCapacites>();
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
        this.etat = Capacite.Etat.NORMAL;
        this.vivant = true;
        this.PV_MAX = point_vie;
        this.MANA_MAX = point_Mana;
        this.id = IDNEXT;
        IDNEXT++;
        quatreCapacite = new int[]{0, 0, 0, 0};
    }
    ///////  Le personnage test ///////
    public Personnage(){
        this.point_vie = 15;
        this.point_Mana = 10;
        this.force = 15;
        this.intelligence = 15;
        this.id = IDNEXT;
        IDNEXT++;
        this.etat = Capacite.Etat.NORMAL;
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
    public Etat getEtat() {
        return etat;
    }
    public void setEtat(Etat etat) {
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
    public int[] getQuatreCapacite() {
        return quatreCapacite;
    }

    //////////////////////// METHODE /////////////////////
    public String toString(){
        return "PV[" + getPoint_vie() + "/" + getPV_MAX() + "], PM[" + getPoint_Mana() + "/" + getMANA_MAX() + "]";
    }
    public String toString2() {
        return ", PV [" + getPoint_vie() + "]"+
                ", PM [" + getPoint_Mana() + "]"+
                ", I [" + getIntelligence() + "]"+
                ", F [" + getForce() + "]"+
                ", A [" + getForce() + "]"+
                ", RP [" + getResPhysique() + "]"+
                ", RM [" + getResMagic() + "]"+
                ", statut [" + getEtat() + "]";
    }
    public void monteeNiveau(int value, int value2){
        setMANA_MAX(value);
        setPV_MAX(value2);
    }
    public void Les4capacite(LesCapacites c, int position){
        quatreCapacite[position] = c.getId();
    }
    public int utilCapa(int numero){
        return quatreCapacite[numero];
    }
    public void subirdegats(LesCapacites capa){
        int degat, pvrestant = getPoint_vie();
        if(capa.isGenre()){
             degat = capa.getDegats() - getResMagic();
        }else{
            degat = capa.getDegats() - getResPhysique();
        }
            pvrestant = pvrestant - degat;
            setPoint_vie(pvrestant);
    }
    public void isVivant(){
        if(getPoint_vie() <= 0){
            setVivant(false);
            setEtat(Capacite.Etat.MORT);
        }else if (getPoint_vie() >= 20 ){
            System.out.println("Toujours vivant(e)");
            setEtat(Capacite.Etat.FORT);
        }else if (getPoint_vie() < 5){
            System.out.println("Toujours vivant(e)");
            setEtat(Capacite.Etat.FAIBLE);
        }else{
            System.out.println("Toujours vivant(e)");
            setEtat(Capacite.Etat.NORMAL);
        }
    }
    public void recup(){
        setPoint_vie(getPV_MAX());
        setPoint_Mana(getMANA_MAX());
    }
    public int nbcapacite(){
        int nb = 0;
        for (int i : quatreCapacite) {
            if (i != 0) {
                nb++;
            }
        }
        return nb;
    }
}
