package hi.is.vidmot.veganifel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.util.Objects;

public class mainController {
    @FXML
    private ComboBox fxListRitara;
    @FXML
    private Label fxTextVerk;
    public String[] verkstjor;
    public Leikmenn L;
    public int rod=0;

    public mainController(){
        //verkstjor=L.Leik[0];
        String[] v = {"Anna", "B", "C", "D", "E", "F", "DW", "y"};
        verkstjor= v;
    }

    public void setL(Leikmenn l) {
        L = l;
        System.out.println("SetL");
    }

    public void DragaSpil() {
        fxListRitara.setItems(null);
        if (nidurstodur()){
            ViewSwitcher.switchTo(View.VERKS);


        }kosningar();
        fxTextVerk.setText(verkefnastjori());
    }

    public String verkefnastjori(){
        String v = verkstjor[rod];
        rod++;
        if(rod==8){
            rod=0;
        }
        ritaraL(v);
        return v+" er verkefnastjóri. "+v +" velur ";
    }
    public void ritaraL(String v){
        int t=0;
        ObservableList<String> s = FXCollections.observableArrayList();
        for(int i =0;i<verkstjor.length;i++){
            if(!Objects.equals(verkstjor[i], v)){
                s.add(verkstjor[i]);
            }
        }
        fxListRitara.setItems(s);
    }
    public void initialize() {
        fxTextVerk.setText(verkefnastjori());
        kosningar();
    }
    @FXML
    public HBox V1;
    @FXML
    public HBox V2;
    @FXML
    public HBox V3;
    @FXML
    public HBox V4;
    @FXML
    public HBox V5;
    @FXML
    public HBox V6;
    @FXML
    public HBox V7;
    @FXML
    public HBox V8;



public int t;
   public void kosningar(){

       V1.getChildren().clear();
       V2.getChildren().clear();
       V3.getChildren().clear();
       V4.getChildren().clear();
       V5.getChildren().clear();
       V6.getChildren().clear();
       V7.getChildren().clear();
       V8.getChildren().clear();

       t=0;
       Button ja1 = new Button("Já");
       ja1.setId("Ja");
       Button nei1 = new Button("Nei");
       nei1.setId("Nei");
       ja1.setOnAction(e -> {
           plus();
           V1.getChildren().removeAll(ja1,nei1);

       });
       nei1.setOnAction(e -> {
           V1.getChildren().removeAll(ja1,nei1);
       });

       Button ja2 = new Button("Já");
       ja2.setId("Ja");
       Button nei2 = new Button("Nei");
       nei2.setId("Nei");
       ja2.setOnAction(e -> {
           plus();
           V2.getChildren().removeAll(ja2,nei2);
       });
       nei2.setOnAction(e -> {
           V2.getChildren().removeAll(ja2, nei2);
       });

       Button ja3 = new Button("Já");
       ja3.setId("Ja");
       Button nei3 = new Button("Nei");
       nei3.setId("Nei");
       ja3.setOnAction(e -> {
           plus();
           V3.getChildren().removeAll(ja3,nei3);
       });
       nei3.setOnAction(e -> {
           V3.getChildren().removeAll(ja3,nei3);
       });

       Button ja4 = new Button("Já");
       ja4.setId("Ja");
       Button nei4 = new Button("Nei");
       nei4.setId("Nei");
       ja4.setOnAction(e -> {
           plus();
           V4.getChildren().removeAll(ja4,nei4);
       });
       nei4.setOnAction(e -> {
           V4.getChildren().removeAll(ja4,nei4);
       });

       Button ja5 = new Button("Já");
       ja5.setId("Ja");
       Button nei5 = new Button("Nei");
       nei5.setId("Nei");
       ja5.setOnAction(e -> {
           plus();
           V5.getChildren().removeAll(ja5,nei5);
       });
       nei5.setOnAction(e -> {
           V5.getChildren().removeAll(ja5,nei5);
       });

       Button ja6 = new Button("Já");
       ja6.setId("Ja");
       Button nei6 = new Button("Nei");
       nei6.setId("Nei");
       ja6.setOnAction(e -> {
           plus();
           V6.getChildren().removeAll(ja6,nei6);
       });
       nei6.setOnAction(e -> {
           V6.getChildren().removeAll(ja6,nei6);
       });

       Button ja7 = new Button("Já");
       ja7.setId("Ja");
       Button nei7 = new Button("Nei");
       nei7.setId("Nei");
       ja7.setOnAction(e -> {
           plus();
           V7.getChildren().removeAll(ja7,nei7);
       });
       nei7.setOnAction(e -> {
           V7.getChildren().removeAll(ja7,nei7);
       });

       Button ja8 = new Button("Já");
       ja8.setId("Ja");
       Button nei8 = new Button("Nei");
       nei8.setId("Nei");
       ja8.setOnAction(e -> {
           plus();
           V8.getChildren().removeAll(ja8,nei8);
       });
       nei8.setOnAction(e -> {
           V8.getChildren().removeAll(ja8,nei8);});


       V1.getChildren().addAll(ja1, nei1);
       V2.getChildren().addAll(ja2,nei2);
       V3.getChildren().addAll(ja3, nei3);
       V4.getChildren().addAll(ja4, nei4);
       V5.getChildren().addAll(ja5, nei5);
       V6.getChildren().addAll(ja6, nei6);
       V7.getChildren().addAll(ja7, nei7);
       V8.getChildren().addAll(ja8, nei8);
    }
    public void plus(){
        t++;
    }
    public boolean nidurstodur(){
        return t>3;
}

    }
