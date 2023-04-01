package hi.is.vidmot.veganifel;

import javafx.collections.ObservableList;

import java.util.Random;

public class Leikmenn {
    //Katrín
    public String[] Blar;
    public String[] Graen;
    public String[] Leik;
    private int NextL=0;

    public Leikmenn(){
        Leik=new String[7];
        Blar=new String[5];
        Graen=new String[1];
    }
    public void hlutverk(){
        Random r =new Random();
        int V=0;
        int U=0;
        Boolean Different=true;
        while (Different) {
            V = r.nextInt();
            U = r.nextInt();
            if(V!=U){
                Different=false;
            }
        }
        int Bnext=0;
        for (int i=0;i<7;i++) {
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
    public boolean fullt(){
        if(NextL == 7){
            hlutverk();
        }return NextL == 7;
    }
    public void add(String nafn){
        if(NextL<7&&nafn!=""){
            Leik[NextL]=nafn;
            NextL+=1;
        }

    }
}
