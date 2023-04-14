package hi.is.vidmot.veganifel;

import hi.is.vidmot.vinnsla.Cards;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
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
        VBox S2=new VBox();
        VBox S3=new VBox();
        Spil.add(S1);
        Spil.add(S2);
        Spil.add(S3);
        fxSpilaListi.getChildren().addAll(S1,S2,S3);
       for(VBox v :Spil){
           v.getChildren().clear();
           Cards s = new Cards();
           ImageView i = s.RandomCard();
           Button velja = new Button("Henda");
           v.setId(i.getId());
           v.getChildren().addAll(i,velja);
            velja.setOnAction(e ->{
               String a= fxbreytaTexta.getText();
                if(Objects.equals(a, "Ritari")){

                    fxSpilaListi.getChildren().remove(v);
                    Next();
                    initialize();

                    return;
                }
               v.getChildren().removeAll(i, velja);
                fxSpilaListi.getChildren().remove(v);
               fela();
               fxbreytaTexta.setText("Ritari");
               text.setText("Þú átta að henda einu spili sem á ekki að fara á leikborðið");

           });
        }
    }

    public void Next(){
        String s=fxSpilaListi.getChildren().get(0).getId();
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
