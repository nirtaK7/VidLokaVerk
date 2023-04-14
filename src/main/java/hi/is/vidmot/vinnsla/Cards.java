package hi.is.vidmot.vinnsla;

import javafx.scene.image.Image;

import java.util.Random;

//Hér er allt sem tngeist spilunum
public class Cards {

    public Image RandomCard(){
        Random r =new Random();
        int x = r.nextInt(100);
        Image a=new Image("@../Myndir/Spil/Blar.jpg");
        Image b=new Image("@../Myndir/Spil/Graen.jpg");
        if(x<33){
            return a;
        }
        return b;
    }

}
