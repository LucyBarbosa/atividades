package level;

public class Level01 {

    private char [][] lv;
    private float combatechance;

    public void setLv(char[][] Lv) {
        this.lv = Lv;
    }
    public char [][] getLv() {
        return this.lv;
    }

    public void setCombatechance(float Combatechance) {
        this.combatechance = Combatechance;
    }
    public float getCombatechance() {
        return this.combatechance;
    }

    public void renderLevel(){
    
    try{
        
            Runtime.getRuntime().exec("cls");
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(lv[0][0]+""+ lv[0][1] +""+ lv[0][2] +""+ lv[0][3] +""+ lv[0][4]);
        System.out.println(lv[1][0]+""+ lv[1][1] +""+ lv[1][2] +""+ lv[1][3] +""+ lv[1][4]);
        System.out.println(lv[2][0]+""+ lv[2][1] +""+ lv[2][2] +""+ lv[2][3] +""+ lv[2][4]);
        System.out.println(lv[3][0]+""+ lv[3][1] +""+ lv[3][2] +""+ lv[3][3] +""+ lv[3][4]);
        System.out.println(lv[4][0]+""+ lv[4][1] +""+ lv[4][2] +""+ lv[4][3] +""+ lv[4][4]);
        System.out.println(lv[5][0]+""+ lv[5][1] +""+ lv[5][2] +""+ lv[5][3] +""+ lv[5][4]);
        System.out.println(lv[6][0]+""+ lv[6][1] +""+ lv[6][2] +""+ lv[6][3] +""+ lv[6][4]);
        System.out.println(lv[7][0]+""+ lv[7][1] +""+ lv[7][2] +""+ lv[7][3] +""+ lv[7][4]);
        System.out.println(lv[8][0]+""+ lv[8][1] +""+ lv[8][2] +""+ lv[8][3] +""+ lv[8][4]);

    try{
        
            Runtime.getRuntime().exec("cls");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

    public Level01() 
    {
        this.lv = new char [][]  {
            {'|', '-', '-', '-', '|'},
            {'|', '-', '-', '-', '|'},
            {'|', '-', '-', '-', '|'},
            {'|', '-', '|', '-', '|'},
            {'|', '-', '|', '_', '|'},
            {'|', '-', '|', '-', '|'},
            {'|', '-', '|', '-', '|'},
            {'|', '-', '-', '-', '|'}
        };
        this.combatechance = 0.5f;
    }


}
