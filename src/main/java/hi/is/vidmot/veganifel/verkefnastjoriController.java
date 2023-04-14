package hi.is.vidmot.veganifel;

import hi.is.vidmot.vinnsla.Cards;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class verkefnastjoriController {

    @FXML
    public VBox S1;
    @FXML
    public VBox S2;
    @FXML
    public VBox S3;

    public void veljaSpil(){
        ObservableList<VBox> Spil= FXCollections.observableArrayList();
        Spil.add(S1);
        Spil.add(S2);
        Spil.add(S3);

        for(VBox v :Spil){
            v.getChildren().clear();
            Cards s = new Cards();
            ImageView i = s.getSpil();
            Button velja = new Button("Velja");
            velja.setId("Velja");

            velja.setOnAction(e ->{
                v.getChildren().removeAll(i, velja);
            });
            v.getChildren().addAll(i,velja);
        }
    }
    public void initialize(){
        veljaSpil();
    }

    public void Next() {
        ViewSwitcher.switchTo(View.MAIN);
    }

}
