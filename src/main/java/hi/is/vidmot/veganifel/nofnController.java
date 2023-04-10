package hi.is.vidmot.veganifel;

import hi.is.vidmot.vinnsla.Leikmenn;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

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
            ViewSwitcher.switchTo(View.HLUTVERK);
            //ViewSwitcher.lookup(View.HLUTVERK);


            /*hlutverkController h=new hlutverkController();
            mainController m= new mainController();


            m = (mainController) ViewSwitcher.lookup(View.MAIN);
            ViewSwitcher.lookup(View.HLUTVERK);
            ViewSwitcher.lookup(View.MAIN);
            h.setL(Leikur);
            m.setL(Leikur);

             */
        }
    }
}
