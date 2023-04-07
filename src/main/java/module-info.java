module hi.is.vidmot.veganifel {
    requires javafx.controls;
    requires javafx.fxml;


    opens hi.is.vidmot.veganifel to javafx.fxml;
    exports hi.is.vidmot.veganifel;
    exports hi.is.vidmot.vinnsla;
    opens hi.is.vidmot.vinnsla to javafx.fxml;
}