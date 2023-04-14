package hi.is.vidmot.veganifel;

import hi.is.vidmot.vinnsla.Leikmenn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;

import java.util.Objects;

/*
    Katrín
 */
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
    private final ObservableList<Button> bList= FXCollections.observableArrayList();

    private static final String ILAGI ="Í lagi";

    public void Next() {
        ViewSwitcher.switchTo(View.MAIN);
    }
    public void setL() {
        nofnController nofnController=(nofnController) ViewSwitcher.lookup(View.NOFN);
        L = nofnController.getLeikur();
        Leik=L.getLeik();
        B1.setText(String.valueOf(Leik[0][0]));

    }


    public void initialize() {
        setL();
        bList.add(B1);
        bList.add(B2);
        bList.add(B3);
        bList.add(B4);
        bList.add(B5);
        bList.add(B6);
        bList.add(B7);
        bList.add(B8);
       for (int i=0;i<bList.size();i++){
            bList.get(i).setText(Leik[i][0]);
        }
    }

    public void synaH(ActionEvent actionEvent){
        String nafn = ((Button) actionEvent.getSource()).getText();
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
        if(Objects.equals(Leik[x][1], "úlfur")){
            for(int i =0;i<Leik.length;i++){
                if(Objects.equals(Leik[i][1], "vegan")){
                    vegan=Leik[i][0];
                }
            }
            return Leik[x][0]+" í þessum leik ert þú "+Leik[x][1]+"\nÞú ert að fara að reyna að safna bláum spilum "+"\nMeð þér í liði er " +vegan +" sem er kind ";
        }
        if(Objects.equals(Leik[x][1], "vegan")){
            return Leik[x][0]+" í þessum leik ert þú "+Leik[x][1]+"\nÞú ert að fara að reyna að safna bláum spilum";
        }

        return Leik[x][0]+" í þessum leik ert þú "+Leik[x][1]+"\nÞú ert að fara að reyna að safna rauðum spilum";
    }
    private Alert stofnaAlert(ButtonType bILagi,String nafn) {
        Alert a = new Alert(Alert.AlertType.NONE,  HlutverkText(nafn), bILagi);
        a.setTitle("Vegan í felum");
        return a;
    }
    public Leikmenn getLeikur() {
        return L;
    }
    public void reglurnar() {
        ViewSwitcher.switchTo(View.HLUTVERKREGLUR);
    }

}

