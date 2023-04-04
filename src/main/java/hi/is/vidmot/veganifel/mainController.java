package hi.is.vidmot.veganifel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class mainController {
    @FXML
    private ComboBox fxListRitara;
    @FXML
    private Label fxTextVerk;
    private boolean vote;
    public String[] verkstjor;
    public Leikmenn L;
    public int rod=0;

    public mainController(){
        vote=false;
        //verkstjor=L.Leik[0];
        String[] v = {"Anna", "B", "C", "D", "E", "F", "DW", "y"};
        verkstjor= v;
    }

    public void setL(Leikmenn l) {
        L = l;
        System.out.println("SetL");
    }

    public void DragaSpil() {
        kosningar();
        fxListRitara.setItems(null);
        if (vote){
            ViewSwitcher.switchTo(View.VERKS);
        }
        initialize();
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
            if(verkstjor[i]!=v){
                s.add(verkstjor[i]);
            }
        }
        fxListRitara.setItems(s);
    }

    public void initialize() {
        fxTextVerk.setText(verkefnastjori());
    }
    public void kosningar(){
        vote=true;
    }

}
