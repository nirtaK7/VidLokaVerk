package hi.is.vidmot.veganifel;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class HlutverkDialog extends Dialog<String> {

    private static ButtonType OKISL;

    public HlutverkDialog(String L) {
        super();
        this.setTitle("Hlutverk");
        buildUI();

    }
    private void buildUI() {
        Pane pane = createGridPane();
        getDialogPane().setContent(pane);
        OKISL = new ButtonType("Í lagi", ButtonBar.ButtonData.OK_DONE);
        getDialogPane().getButtonTypes().addAll(OKISL);
    }
    public Pane createGridPane() {
        VBox content = new VBox(10);
        GridPane grid = new GridPane();
        Label A=new Label("awawd");
        Label B=new Label("awasdfwd");
        grid.setHgap(10);
        grid.setVgap(5);
        grid.add(A,0,0);
        grid.add(B,1,0);

        content.getChildren().add(grid);
        return content;

    }


}
