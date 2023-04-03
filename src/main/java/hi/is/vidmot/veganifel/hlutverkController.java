package hi.is.vidmot.veganifel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

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

    private static final String ILAGI ="Í lagi";


    public hlutverkController(){

    }

    public void setL(Leikmenn l) {
        L = l;
        Leik=L.getLeik();
        //initialize();
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
            //bList.get(i).setText(Leik[i][0]);
        }
    }
    public void synaH(ActionEvent actionEvent){
        //String nafn = ((Button) actionEvent.getSource()).getText();
        String nafn="a";
        ButtonType bType = new ButtonType(ILAGI,
                ButtonBar.ButtonData.OK_DONE);
        Alert a = stofnaAlert(bType,nafn);
        a.showAndWait();
    }
    private String HlutverkText(String nafn){
        String vegan="";
        int x = 0;
        for(int i =0;i<8;i++){
            if(Objects.equals(Leik[i][0], nafn)){
                x=i;
            }
        }
        if(Objects.equals(Leik[x][1], "Úlfur")){
            for(int i =0;i<Leik.length;i++){
                if(Leik[i][1]=="Vegan"){
                    vegan=Leik[i][0];
                }
            }
            return Leik[x][0]+"Í þessum leik ert þú "+Leik[x][1]+"\nMeð þér í liði er Vegan "+vegan;
        }
        return Leik[x][0]+"Í þessum leik ert þú "+Leik[x][1];
    }
    private Alert stofnaAlert(ButtonType bILagi,String nafn) {
        String hlutverkT=HlutverkText(nafn);
        Alert a = new Alert(Alert.AlertType.NONE,  hlutverkT, bILagi);
        a.setTitle("Vegan í felum");
        a.setHeaderText("Hlutverkið ");
        return a;
    }


}
