package hi.is.vidmot.veganifel;

import hi.is.vidmot.vinnsla.Leikmenn;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
/*
    Katrín
 */
public class nofnController {

    @FXML
    private TextField L1;
    @FXML
    private TextField L2;
    @FXML
    private TextField L3;
    @FXML
    private TextField L4;
    @FXML
    private TextField L5;
    @FXML
    private TextField L6;
    @FXML
    private TextField L7;
    @FXML
    private TextField L8;
    public Leikmenn Leikur;
    public Leikmenn getLeikur() {
        return Leikur;
    }

    public void Next() {
        Leikur =new Leikmenn();
        Leikur.add(L1.getText());
        Leikur.add(L2.getText());
        Leikur.add(L3.getText());
        Leikur.add(L4.getText());
        Leikur.add(L5.getText());
        Leikur.add(L6.getText());
        Leikur.add(L7.getText());
        Leikur.add(L8.getText());

        if(Leikur.fullt()){
            ViewSwitcher.lookup(View.HLUTVERK);
            ViewSwitcher.switchTo(View.HLUTVERK);
        }
        else {
                ButtonType bType = new ButtonType("Í lagi",
                    ButtonBar.ButtonData.OK_DONE);
                Alert a = new Alert(Alert.AlertType.NONE,  "Það verðru að setja inn nöfn allra\nleikmanna áður en haldið er áfram", bType);
                a.setTitle("Vegan í felum");
            a.showAndWait();

        }
    }

    public void reglurnar() {
        ViewSwitcher.switchTo(View.NOFNREGLUR);
    }

}

