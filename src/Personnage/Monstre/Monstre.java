package Personnage.Monstre;

import Capacité.LesCapacites;
import Donjon.Salle.NatureElement;
import Personnage.*;
import Personnage.Monstre.AideFormation.EMosntre;
import Personnage.Monstre.AideFormation.NomMonstre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class Monstre extends Personnage implements IPersonnage {

    private int charisme;
    private boolean dompter;
    private NatureElement natType;
    private boolean vol;
    private String nom;
    private String race;
    private boolean magic;
    private int niveau;
    private List<LesCapacites> CapaciteChoisie = new ArrayList<>();

    public Monstre(int point_vie, int point_Mana, int intelligence, int force, int agile, int resPhysique, int resMagic,
                   int charisme, EMosntre lemonstre, NatureElement natType, NomMonstre nomMonstre,
                   boolean magic, int niveau){
        super(point_vie, point_Mana, intelligence, force, agile, resPhysique, resMagic);
        this.charisme = charisme;
        this.dompter = false;
        this.natType = natType;
        this.nom = nomMonstre.getNom();
        this.vol = lemonstre.isVol();
        this.race = lemonstre.getRace();
        this.magic = magic;
        this.niveau = niveau;
        for ( LesCapacites c: LesCapacites.values()) {
            if(c.getType().equals("m") || c.getType().equals("g")){
                if(c.getEtat().equals("normal") || c.getEtat().equals(getNatType().getNom())){
                    if(!c.isGenre()){
                        CapaciteTout.add(c);
                     }
                    if(isMagic() && c.isGenre()){
                        CapaciteTout.add(c);
                    }
                }
            }
        }
        remplirLesQuatre();
        for (LesCapacites v: CapaciteChoisie){
            for (int i = 0; i < quatreCapacite.length; i++) {
                if(quatreCapacite[i] == 0){
                    quatreCapacite[i] = v.getId();
                    break;
                }
            }
        }
    }
    private void         remplirLesQuatre(){
        triParNiveau(niveau);
        triParDegat();
    }
    private void         triParDegat(){
        CapaciteChoisie.sort((a,b) -> a.getDegats() < b.getDegats() ? +1 : -1);
    }
    private void         triParNiveau(int niv){
        for (LesCapacites c : CapaciteTout) {
            if( c.getNiveau() == niv || c.getNiveau() < niv )
            {
                CapaciteChoisie.add(c);
            }
        }
    }
    public String        toString() {
        return "Monstre {" + " Race: " + getRace() + " De niveau : " + getNivMonstre() + super.toString2() +
                ", CH [" + getCharisme() +"]"+ apparanceDompter() + siLeMosntreVole() + " Nature [" + natType.getNom()
                + "]"+ ", nom [" + getNom() + " de " + natType.getNom() + "] }";
    }
    private String        apparanceDompter(){
        if(isDompter()){
            return ", Monstre [ Libre ]" ;
        }else{
            return ", Dompté [" + isDompter() + "]";
        }
    }
    private String        siLeMosntreVole(){
        if(isVol()){
            return ", Monstre [ Volant ],";
        }else{
            return ",";
        }
    }
    public void          setDompter(boolean dompter) {
        this.dompter = dompter;
    }
    public int           getCharisme() {
        return charisme;
    }
    public boolean       isDompter() {
        return dompter;
    }
    public NatureElement getNatType() {
        return natType;
    }
    public boolean       isVol() {
        return vol;
    }
    public String        getNom() {
        return nom;
    }
    public String        getRace() {
        return race;
    }
    public boolean       isMagic() {
        return magic;
    }
    public int           getNivMonstre() {
        return niveau;
    }
}
