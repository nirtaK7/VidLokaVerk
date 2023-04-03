package hi.is.vidmot.veganifel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
//Katrín
public class hlutverkController{
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

    public String[][] Leik;
    public Leikmenn L;
    private ObservableList<Button> bList= FXCollections.observableArrayList();


    public hlutverkController(){

    }

    public void getL(Leikmenn l) {
        L = l;
        Leik=L.getLeik();
        initialize();
        System.out.println("Leik[" +Leik[0][0]);
        //B1.setText(String.valueOf(Leik[0][0]));

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
            //System.out.println("Leik[" + i + "] = "+Leik[i][0]);
           // bList.get(i).setText(Leik[i][0]);
        }



    }


}
