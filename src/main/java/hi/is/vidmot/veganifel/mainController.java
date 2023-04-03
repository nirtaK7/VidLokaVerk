package hi.is.vidmot.veganifel;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class mainController {
    @FXML
    private ChoiceBox fxListRitara;
    @FXML
    private Label fxTextVerk;
    private boolean vote;
    public String[] verkstjor;
    public Leikmenn L;
    public int rod=0;
    public void mainController(){
        vote=false;
        verkstjor=L.Leik[0];
    }

    public void setL(Leikmenn l) {
        L = l;
        System.out.println("SetL");
    }

    public void DragaSpil() {
        if (vote){
            ViewSwitcher.switchTo(View.VERKS);
        }
    }
    public void kosningar(){
        vote=true;
    }
    /*
    public String verkefnastjori(){
        String v = verkstjor[rod];
        if(rod==7){
            rod=0;
        }
        else rod++;
        return v+" er verkefnastjóri."+v +" velur ";
    }
    public void ritaraL(String v){
        int t=0;
        for(int i =0;i<verkstjor.length;i++){
            if(verkstjor[i]!=v){
                //s.add(verkstjor[i]);
            }
        }
        //fxListRitara.setItems(s);




    }

    public void initialize() {

        String v = verkefnastjori();
        fxTextVerk.setText(verkefnastjori());
    }

     */
}
