package hi.is.vidmot.vinnsla;

import java.util.Random;
/*
    Katrín
 */
public class Leikmenn {
    public String[] Raudur;
    public String[] Graen;
    public String[][] Leik;
    public String[] nofn;
    private int NextL;
    public Leikmenn(){
        Leik=new String[8][2];
        nofn=new String[8];
        Raudur=new String[6];
        Graen=new String[2];
        NextL=0;

    }
    public void hlutverk(){
        Random r =new Random();
        int V=0;
        int U=0;
        boolean Different=true;
        while (Different) {
            V = r.nextInt(8);
            U = r.nextInt(8);
            if(V!=U){
                Different=false;
            }
        }
        int Bnext=0;
        for (int i=0;i<8;i++) {
            if(i==V){
                Graen[0]=Leik[i][0];
                Leik[i][1]="kind";

            }
            else if(i==U){
                Graen[1]=Leik[i][0];
                Leik[i][1]="vegan";

            }
            else {
                Raudur[Bnext]=Leik[i][0];
                Leik[i][1]="kjötæta";

                ++Bnext;
            }
        }
    }

    public String[] getBlar() {
        return Raudur;
    }

    public String[] getGraen() {
        return Graen;
    }

    public String[][] getLeik() {
        return Leik;
    }

    public String[] getNofn() {
        return nofn;
    }

    public boolean fullt(){
        if(NextL == 8){
            hlutverk();
        }return NextL == 8;
    }
    public void add(String nafn){
        if(nafn.length()>0){
            nofn[NextL]=nafn;
            Leik[NextL][0]=nafn;
            NextL++;
        }

    }
}
