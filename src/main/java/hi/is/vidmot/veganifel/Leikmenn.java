package hi.is.vidmot.veganifel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;
//Katrín
public class Leikmenn {
    //Katrín

    public String[] Blar;
    public String[] Graen;
    public String[][] Leik;
    private int NextL;
    public Leikmenn L;



    public Leikmenn(){
        Leik=new String[8][2];
        Blar=new String[6];
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
                L.Graen[0]=L.Leik[i][0];
                L.Leik[i][1]="Úlfur";

            }
            else if(i==U){
                L.Graen[1]=L.Leik[i][0];
                L.Leik[i][1]="Vegan";

            }
            else {
                L.Blar[Bnext]=L.Leik[i][0];
                L.Leik[i][1]="Alæta";

                ++Bnext;
            }
            System.out.println("L"+i+L.Leik[i][1]);
        }
    }
    public Leikmenn getL() {
        return L;
    }
    public void setL(Leikmenn Leikur) {
        L = Leikur;
    }

    public String[] getBlar() {
        return Blar;
    }

    public String[] getGraen() {
        return Graen;
    }

    public String[][] getLeik() {
        System.out.println("getLeik "+Leik[1][0] );
        return Leik;
    }

    public boolean fullt(){
        if(L.NextL == 8){
            hlutverk();
            System.out.println("Fullt "+L.Leik[0][0] );
        }//return NextL == 8;
        return true;

    }
    public void add(String nafn){
        if(nafn.length()>0){
            L.Leik[NextL][0]=nafn;
            System.out.println(L.Leik[NextL][0]);
            L.NextL++;
        }

    }
}
