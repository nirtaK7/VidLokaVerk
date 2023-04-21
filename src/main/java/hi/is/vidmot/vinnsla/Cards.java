package hi.is.vidmot.vinnsla;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

//Hér er allt sem tngeist spilunum
public class Cards {

    public ImageView RandomCard(){
        Random r =new Random();
        int x = r.nextInt(101);
        ImageView k = new ImageView();
        Image a=new Image(getClass().getResourceAsStream("/hi/is/vidmot/Myndir/Spil/Blar.jpg"));
        Image b=new Image(getClass().getResourceAsStream("/hi/is/vidmot/Myndir/Spil/Graen.jpg"));

        if(x<=30){
            k.setImage(a);
            k.setId("B");
        }
        else if (x>30){
            k.setImage(b);
            k.setId("G");
        }
        k.setFitHeight(300);
        k.setFitWidth(200);
        return k;
    }

}
