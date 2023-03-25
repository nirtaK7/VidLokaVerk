module hi.is.vidmot.veganifel {
    requires javafx.controls;
    requires javafx.fxml;


    opens hi.is.vidmot.veganifel to javafx.fxml;
    exports hi.is.vidmot.veganifel;
}