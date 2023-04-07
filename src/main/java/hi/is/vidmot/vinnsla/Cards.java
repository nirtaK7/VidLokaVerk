package hi.is.vidmot.vinnsla;

import java.util.Random;

//Hér er allt sem tngeist spilunum
public class Cards {
    public Cards[] drogurS;
    public Cards(){
        drogurS=new Cards[3];
    }
    public String RandomCard(){
        Random r =new Random();
        int x = r.nextInt(100);
        if(x<33){
            return "Green";
        }
        return "Blue";
    }
    public Cards[] getDrogurS() {
        return drogurS;
    }

    public void setDrogurS(Cards[] drogurS) {
        this.drogurS = drogurS;
    }
}
