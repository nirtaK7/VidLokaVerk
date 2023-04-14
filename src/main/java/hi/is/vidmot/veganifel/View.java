package hi.is.vidmot.veganifel;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public enum View {

    NOFN("nofn-view.fxml"),
    HLUTVERK("Shlutverk-view.fxml"),
    MAIN("main-view.fxml"),
    VERKS("verkefnastjori-view.fxml"),

    RITARI("ritari-view.fxml"),
    MAINREGLUR("mainReglur-view.fxml"),
    NOFNREGLUR("nofnReglur-view.fxml"),
    HLUTVERKREGLUR("hlutverkReglur-view.fxml"),
    Saga("saga-view.fxml");



    private String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
