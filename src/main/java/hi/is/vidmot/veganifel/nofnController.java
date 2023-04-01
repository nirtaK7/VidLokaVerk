package hi.is.vidmot.veganifel;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

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

    public void Next() {
        Leikmenn Leikur =new Leikmenn();
        Leikur.add(L1.getText());
        Leikur.add(L2.getText());
        Leikur.add(L3.getText());
        Leikur.add(L4.getText());
        Leikur.add(L5.getText());
        Leikur.add(L6.getText());
        Leikur.add(L7.getText());
        Leikur.add(L8.getText());
        ViewSwitcher.switchTo(View.HLUTVERK);
        /*if(Leikur.fullt()){
            ViewSwitcher.switchTo(View.HLUTVERK);
        }

         */


    }
}
