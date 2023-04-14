package hi.is.vidmot.veganifel;

import hi.is.vidmot.vinnsla.Cards;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class verkefnastjoriController {

    @FXML
    public HBox fxSpilaListi;
    public void veljaSpil(){
        VBox S1=new VBox();
        S1.setId("S1");
        VBox S2=new VBox();
        S2.setId("S2");
        VBox S3=new VBox();
        S3.setId("S3");
        ObservableList<VBox> Spil= FXCollections.observableArrayList();
        Spil.add(S1);
        Spil.add(S2);
        Spil.add(S3);
        fxSpilaListi.getChildren().addAll(S1,S2,S3);

       for(VBox v :Spil){
            v.getChildren().clear();
            Cards s = new Cards();
           final ImageView i = s.RandomCard();
           final Button velja = new Button("Velja");
           System.out.println ("AAA");
           v.getChildren().addAll(i,velja);
            System.out.println (v.getChildren());
            velja.setOnAction(e ->{
               v.getChildren().removeAll(i, velja);
           });
        }
    }

    public void initialize(){
        veljaSpil();
    }

    public void Next() {
        ViewSwitcher.switchTo(View.MAIN);
    }

}
