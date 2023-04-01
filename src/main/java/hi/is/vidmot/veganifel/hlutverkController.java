package hi.is.vidmot.veganifel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class hlutverkController extends nofnController{
   @FXML
    private Button B1;
    @FXML
    private Button B2;
    @FXML
    private Button B3;
    @FXML
    private Button B4;
    @FXML
    private Button B5;
    @FXML
    private Button B6;
    @FXML
    private Button B7;
    @FXML
    private Button B8;
    public String[] Graen;
    public String[] Blar;
    public String[] Leik;
    private ObservableList<Button> bList= FXCollections.observableArrayList();

    public hlutverkController(){

    }
    public void get(){
        Leikmenn HlutV=getLeikur();
       /* this.Blar=HlutV.getBlar();
        this.Graen=HlutV.getGraen();
        this.Leik=HlutV.getLeik();
        */
        //System.out.println("Leik[" + 0 + "] = "+Leik[0]);
    }
    public void Next() {
        ViewSwitcher.switchTo(View.MAIN);
    }
    public void initialize() {

        bList.add(B1);
        bList.add(B2);
        bList.add(B3);
        bList.add(B4);
        bList.add(B5);
        bList.add(B6);
        bList.add(B7);
        bList.add(B8);
        for (int i=0;i<bList.size();i++){
           // System.out.println("Leik[" + i + "] = ");
            //bList.get(i).setText(Leik[i]);
        }




    }


}
