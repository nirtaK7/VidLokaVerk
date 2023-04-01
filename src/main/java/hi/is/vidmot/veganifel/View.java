package hi.is.vidmot.veganifel;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public enum View {

    NOFN("nofn-view.fxml"),
    HLUTVERK("hlutverk-view.fxml"),
    MAIN("main-view.fxml"),
    VERKS("verkefnastjori-view.fxml"),
    RITARI("ritari-view.fxml");


    private String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
