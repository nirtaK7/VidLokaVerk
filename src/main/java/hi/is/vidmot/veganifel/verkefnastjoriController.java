package hi.is.vidmot.veganifel;

import hi.is.vidmot.vinnsla.Cards;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Objects;


public class verkefnastjoriController {

    @FXML
    public HBox fxSpilaListi;
    @FXML
    public Button fxFela;
    @FXML
    public Label text;
    @FXML
    public Label fxbreytaTexta;
    public ObservableList<VBox> Spil= FXCollections.observableArrayList();
    public void veljaSpil(){
        VBox S1=new VBox();
        S1.setId("S1");
        VBox S2=new VBox();
        S2.setId("S2");
        VBox S3=new VBox();
        S3.setId("S3");
        Spil.add(S1);
        Spil.add(S2);
        Spil.add(S3);
        fxSpilaListi.getChildren().addAll(S1,S2,S3);

       for(VBox v :Spil){
            v.getChildren().clear();
            Cards s = new Cards();
           final ImageView i = s.RandomCard();
           final Button velja = new Button("Henda");
           v.getChildren().addAll(i,velja);
            velja.setOnAction(e ->{
               String a= fxbreytaTexta.getText();
                if(Objects.equals(a, "Ritari")){
                    initialize();
                    Next();
                    return;
                }
               v.getChildren().removeAll(i, velja);
               fela();
               fxbreytaTexta.setText("Ritari");
               text.setText("Þú átta að henda einu spili sem á ekki að fara á leikborðið");
           });
        }
    }
    public void Next(){
        ViewSwitcher.switchTo(View.MAIN);
    }
    public void setText(){
        fxbreytaTexta.setText("Verkefnastjóri");
        fxFela.setText("Sýna spil");
        text.setText("Þú átt að velja eitt spil til að henda.\n Það er spilið sem ritarinn mun ekki fá");
    }
    public void initialize(){
        setText();
        fxSpilaListi.getChildren().clear();
        Spil.clear();
        fxSpilaListi.setVisible(false);
        veljaSpil();
    }
    public void fela(){
        String s=fxFela.getText();
        if(Objects.equals(s, "Fela spil")){
            fxFela.setText("Sýna spil");
            fxSpilaListi.setVisible(false);
        }
        if(Objects.equals(s, "Sýna spil")){
            fxFela.setText("Fela spil");
            fxSpilaListi.setVisible(true);
        }
        }



}
