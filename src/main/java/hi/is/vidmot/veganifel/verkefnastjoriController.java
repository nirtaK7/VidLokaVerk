package hi.is.vidmot.veganifel;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class verkefnastjoriController {
    public void Next() {
        ViewSwitcher.switchTo(View.MAIN);
    }
    @FXML
    private ImageView image;
    @FXML
    Label fxbreytaTexta;
    void veljaSpil(MouseEvent event) {
        image.setVisible(false);
        fxbreytaTexta.setText("Veldu það spil sem að þú vilt leggja niður á borðið");
    }
}
