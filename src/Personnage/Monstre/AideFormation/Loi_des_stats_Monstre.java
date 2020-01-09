package Personnage.Monstre.AideFormation;

import Personnage.Monstre.EMosntre;
import com.sun.deploy.panel.AbstractRadioPropertyGroup;

public class Loi_des_stats_Monstre {
    private int niveau;
    public Loi_des_stats_Monstre(int niveau){
        this.niveau = niveau;
    }

    public int PointVitaux(EMosntre n){
        int stat = 0 ;
        switch (n.getRatioApparition()){
            case 1 :
                stat = 24*niveau;
                break;
                case 2 :
                    stat = 19*niveau;
                break;
                case 3 :
                    stat = 18*niveau;
                break;
                case 4 :
                    stat = 17*niveau;
                break;
                case 5 :
                    stat = 15*niveau;
                break;
                case 6 :
                    stat = 13*niveau;
                break;
                case 7 :
                    stat = 12*niveau;
                break;
                case 8 :
                    stat = 11*niveau;
                break;
                case 9 :
                    stat = 9*niveau;
                break;
            case 10 :
                stat = 7*niveau;
                    break;
            default:
                stat = 15 * niveau;
                break; // pour le boss
        }
        return stat;
    }
    public int pointDeMana(EMosntre m){
        int stat = 0 ;
        switch (m.getRatioApparition()){
            case 1 :
                stat = 5*niveau;
                break;
                case 2:
                stat = 5*niveau;
                break;
                case 3:
                stat = 5*niveau;
                break;
                case 4:
                stat = 10*niveau;
                break;
                case 5:
                stat = 10*niveau;
                break;
                case 6:
                stat = 10*niveau;
                break;
                case 7:
                stat = 10*niveau;
                break;
                case 8:
                stat = 15*niveau;
                break;
                case 9:
                stat = 15*niveau;
                break;
                case 10:
                stat = 15*niveau;
                break;
            default:
                stat = 25*niveau;
        }
        return stat;
    }
    public int statR( EMosntre m){
        int statR =0;
        switch (m){
            case GOLEM:
            case GOLEMAILEE:
                statR = niveau;
                break;
            case TROLL:
                if( niveau <= 2 ){
                    statR = 1;
                }else{
                    statR = niveau + 1;
                }
                break;
            case DRAGON:
                if( niveau > 2)
                {
                    statR = niveau + 2;
                }else{
                    statR = 2;
                }
                break;
            default:
            if(niveau > 5) {
                statR = niveau - 5;
            }else if( niveau == 5){
                statR = 1;
            }
                break;
        }
        return statR;
    }
    public int statIntel(EMosntre m){
         int stat = 10;
         switch (m) {
             case ORC:
             case LOUPS:
             case SLIME:
             case TROLL:
             case GOBELIN:
                stat += niveau;
                 break;
             case DRAGON:
                 stat = 15 + niveau;
             default:
                 stat = 0;
         }
        return stat;
    }
    public int statforce(EMosntre m){
         int stat = 9;
         switch (m) {
             case ORC:
                 stat = 11 + niveau;
                 break;
             case SLIME:
                 stat = 4 + niveau;
                 break;
             case TROLL:
                 stat = 18 + niveau;
                 break;
             case DRAGON:
                 stat = 16 + niveau;
                 break;
             case GOBELIN:
                 stat = 5 + niveau;
                 break;
             case GOLEMAILEE:
             case GOLEM:
                 stat = 20;
                 break;
             default:
                 stat += niveau;
         }
        return stat;
    }
    public int statAgile(EMosntre m){
         int stat = 10;
         switch (m) {
             case ORC:
                 stat = 7 + niveau;
                 break;
             case SLIME:
                 stat = 8 + niveau;
                 break;
             case DRAGON:
                 stat = 13 + niveau;
                 break;
             case GOBELIN:
                 stat = 9 + niveau;
                 break;
             case GOLEMAILEE:
             case GOLEM:
                 stat = 5 + niveau;
                 break;
             default:
                 stat += niveau;
                 break;
         }
        return stat;
    }
    public int restcharisme(EMosntre m){
         int stat = 0;
         switch (m) {
             case TROLL:
                 stat = 10 + niveau;
                 break;
             case DRAGON:
                 stat = 15 + niveau;
                 break;
             case GOLEMAILEE:
             case GOLEM:
                 stat = 99;
                 break;
             default:
                 stat = 5 + niveau;
                 break;
         }
        return stat;
    }

}
