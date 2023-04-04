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
       ObservableList<HBox> kos=FXCollections.observableArrayList();
       kos.add(V1);
       kos.add(V2);
       kos.add(V3);
       kos.add(V4);
       kos.add(V5);
       kos.add(V6);
       kos.add(V7);
       kos.add(V8);
       for(HBox h :kos){
           h.getChildren().clear();
       }
       for(HBox h :kos){
           h.getChildren().clear();
           Button ja = new Button("Já");
           ja.setId("Ja");
           Button nei = new Button("Nei");
           nei.setId("Nei");
           ja.setOnAction(e -> {
               plus();
               h.getChildren().removeAll(ja,nei);
           });
           nei.setOnAction(e -> {
               h.getChildren().removeAll(ja,nei);
           });
           h.getChildren().addAll(ja, nei);
       }
    }
    public void plus(){
        t++;
    }
    public boolean nidurstodur(){
        return t>3;
}

    }
