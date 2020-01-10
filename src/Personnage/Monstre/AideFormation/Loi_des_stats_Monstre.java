package Personnage.Monstre.AideFormation;

public class Loi_des_stats_Monstre {
    private int niveau;
    public Loi_des_stats_Monstre(int niveau){
        this.niveau = niveau;
    }

    public int PointVitaux (EMosntre n){
        int stat;
        switch (n.getRatioApparition()){
            case 1 :
                stat = 24 + 9*niveau;
                break;
                case 2 :
                    stat = 19 + 8*niveau;
                break;
                case 3 :
                    stat = 18 + 7*niveau;
                break;
                case 4 :
                    stat = 17+ 6*niveau;
                break;
                case 5 :
                    stat = 15 + 5*niveau;
                break;
                case 6 :
                    stat = 13 + 4*niveau;
                break;
                case 7 :
                    stat = 12 + 3*niveau;
                break;
                case 8 :
                    stat = 11 + 3*niveau;
                break;
                case 9 :
                    stat = 9+ 2*niveau;
                break;
            case 10 :
                stat = 7 + 2*niveau;
                    break;
            default:
                stat = 15 + 10 * niveau;
                break;
        }
        return stat;
    }
    public int pointDeMana (EMosntre m){
        int stat;
        switch (m.getRatioApparition()){
                case 1 :
                case 2:
                case 3:
                stat = 20 * niveau;
                break;
                case 4:
                case 5:
                case 6:
                case 7:
                stat = 10*niveau;
                break;
            case 8:
            case 9:
            case 10:
                stat = 5*niveau;
            default:
                stat = 25*niveau;
        }
        return stat;
    }
    public int statR       (EMosntre m){
        int statR;
        switch (m.getRatioApparition()){
            case 0 :
                statR = niveau;
                break;
            case 1:
            case 2:
                if(niveau <= 2) {
                    statR = 2;
                }else{
                    statR = 4 + (niveau/4);
                }
                break;
                case 3:
                if(niveau <= 3){
                    statR = 1;
                }else{
                    statR = niveau - 2;
                }
                break;
            default:
                statR = (niveau/5);
                break;
        }
        return statR;
    }
    public int statRMagic  (EMosntre m){
        int statR;
        switch (m.getRatioApparition()){
            case 0:
                statR = niveau;
                break;
            case 1:
                if(niveau <= 2) {
                    statR = 2;
                }else{
                    statR = 4 + (niveau/4);
                }
                break;
            case 3:
                if(niveau <= 2) {
                    statR = 1;
                }else{
                    statR = 3 + (niveau/4);
                }
                break;
            case 4:
                statR = 3;
                if(niveau > 5)
                {
                    statR += 3;
                }
                break;
            case 8:
                statR = 1;
                if( niveau > 5)
                {
                    statR += 2;
                }
                break;
            default:
                if( niveau < 5){
                    statR = 0;
                }else{
                    statR = 1;
                }

        }
        return statR;
    }
    public int statIntel   (EMosntre m){
         int stat;
         switch (m.getRatioApparition()) {
             case 0:
                 stat = 17;
                 break;
             case 1:
                 if( niveau < 3)
                 {
                     stat = 14;
                 }else{
                     stat = 14 + niveau;
                 }
                 break;
             case 4:
                 stat = 18 ;
                 break;
             case 5:
             case 7:
             case 8:
                 stat = 13;
                 if(niveau < 6){
                     stat = 15;
                 }
                 break;
             default:
                 stat = 7;
                 if(niveau > 5)
                 {
                     stat = 11;
                 }
                 break;
         }
        return stat;
    }
    public int statforce   (EMosntre m){
         int stat;
         switch (m.getRatioApparition()) {
             case 0 :
                 stat = 15 + niveau;
                 break;
             case 1:
                 stat = 15 + (niveau/2);
                 break;
             case 2:
                 stat = 13 + (niveau/2);
                 break;
             case 5:
                 stat = 11 + (niveau/3);
                 break;
             case 6:
                 stat = 13 + (niveau/3);
                 break;
             default:
                 if(niveau < 5){
                    stat = 9;
                 }else{
                     stat = 13;
                 }
                 break;
         }
        return stat;
    }
    public int statAgile   (EMosntre m){
         int stat;
         switch (m.getRatioApparition()) {
             case 0:
                 stat = 10;
                 break;
             case 1:
             case 3:
                 stat = 7 + (niveau/2);
                 break;
             case 5:
                 stat = 5 + (niveau/2);
                 break;
             case 7:
                 stat = 3 + (niveau/3);
                 break;

             default:
                 if(niveau < 5){
                     stat = 5;
                 }else{
                     stat = 7;
                 }
                 break;
         }
        return stat;
    }
    public int restcharisme(EMosntre m){
         int stat;
         switch (m.getRatioApparition()) {
             case 0 :
                 stat = 20;
                 break;
             case 1:
                    stat = 18;
                 break;
             case 2:
             case 3:
                 stat = 15;
                 break;
             case 4 :
                 stat = 16;
                 break;
             case 5:
                 stat = 13;
                 break;
             default:
                 stat = 8 + niveau;
                 break;
         }
        return stat;
    }

}
