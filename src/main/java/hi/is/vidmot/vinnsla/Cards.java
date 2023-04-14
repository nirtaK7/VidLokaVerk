package hi.is.vidmot.vinnsla;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

//Hér er allt sem tngeist spilunum
public class Cards {

    public ImageView RandomCard(){
        Random r =new Random();
        int x = r.nextInt(100);
        ImageView k = new ImageView();
        Image a=new Image(getClass().getResourceAsStream("/hi/is/vidmot/Myndir/Spil/Blar.jpg"));
        Image b=new Image(getClass().getResourceAsStream("/hi/is/vidmot/Myndir/Spil/Graen.jpg"));
        if(x<33){
            k.setImage(a);
            k.setId("B");
        }
        else {
            k.setImage(b);
            k.setId("G");
        }
        k.setFitHeight(300);
        k.setFitWidth(200);
        return k;
    }

}
