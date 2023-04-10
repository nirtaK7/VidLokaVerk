package hi.is.vidmot.vinnsla;

import java.util.Random;
//Katrín
public class Leikmenn {
    //Katrín

    public String[] Blar;
    public String[] Graen;
    public String[][] Leik;
    private int NextL;
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
                Graen[0]=Leik[i][0];
                Leik[i][1]="Úlfur";

            }
            else if(i==U){
                Graen[1]=Leik[i][0];
                Leik[i][1]="Vegan";

            }
            else {
                Blar[Bnext]=Leik[i][0];
                Leik[i][1]="Alæta";

                ++Bnext;
            }
            System.out.println("L"+i+Leik[i][1]);
        }
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
        if(NextL == 8){
            hlutverk();
            System.out.println("Fullt "+Leik[0][0] );
        }return NextL == 8;
    }
    public void add(String nafn){
        if(nafn.length()>0){
            Leik[NextL][0]=nafn;
            System.out.println(Leik[NextL][0]);
            NextL++;
        }

    }
}
