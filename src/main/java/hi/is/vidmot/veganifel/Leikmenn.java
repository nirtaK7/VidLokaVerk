package hi.is.vidmot.veganifel;

import javafx.collections.ObservableList;

import java.util.Random;

public class Leikmenn {
    //Katrín
    public String[] Blar;
    public String[] Graen;
    public String[] Leik;
    private int NextL;

    public Leikmenn(){
        Leik=new String[8];
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
                Graen[0]=Leik[i];
            }
            else if(i==U){
                Graen[1]=Leik[i];
            }
            else {
                Blar[Bnext]=Leik[i];
                ++Bnext;
            }
        }
    }

    public String[] getBlar() {
        return Blar;
    }

    public String[] getGraen() {
        return Graen;
    }

    public String[] getLeik() {
        return Leik;
    }

    public boolean fullt(){
        if(NextL == 8){
            hlutverk();
        }//return NextL == 8;
        return true;

    }
    public void add(String nafn){
        if(nafn.length()>0){
            Leik[NextL]=nafn;
            //System.out.println(Leik[NextL]);
            NextL++;
        }

    }
}
