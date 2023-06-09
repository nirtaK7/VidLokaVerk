package hi.is.vidmot.veganifel;

import hi.is.vidmot.vinnsla.Leikmenn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.util.List;
import java.util.Objects;

/*
    Katrín
 */
public class mainController {
    @FXML
    private ComboBox fxListRitara;
    @FXML
    private Label fxTextVerk;
    @FXML
    public HBox V1;
    @FXML
    public HBox V2;
    @FXML
    public HBox V3;
    @FXML
    public HBox V4;
    @FXML
    public HBox V5;
    @FXML
    public HBox V6;
    @FXML
    public HBox V7;
    @FXML
    public HBox V8;
    @FXML
    public Label L1;
    @FXML
    public Label L2;
    @FXML
    public Label L3;
    @FXML
    public Label L4;
    @FXML
    public Label L5;
    @FXML
    public Label L6;
    @FXML
    public Label L7;
    @FXML
    public Label L8;
    public ObservableList<String> nofnLeikmanna = FXCollections.observableArrayList();
    public String[] Leik;
    public Leikmenn L;
    public int rod=0;
    private int j=0;
    private int n=0;
    @FXML
    public Pane B1;
    @FXML
    public Pane B2;
    @FXML
    public Pane B3;
    @FXML
    public Pane B4;
    @FXML
    public Pane B5;
    @FXML
    public Pane B6;
    @FXML
    public Pane B0;
    @FXML
    public Pane G1;
    @FXML
    public Pane G2;
    @FXML
    public Pane G3;
    @FXML
    public Pane G4;
    @FXML
    public Pane G5;
    @FXML
    public Pane G6;
    @FXML
    public Pane G0;

    public void setL() {
        hlutverkController hlutverkController=(hlutverkController) ViewSwitcher.lookup(View.HLUTVERK);
        L = hlutverkController.getLeikur();
        Leik=L.getNofn();
    }
    public void setLabel() {
        ObservableList<Label> L=FXCollections.observableArrayList();
        L.add(L1);
        L.add(L2);
        L.add(L3);
        L.add(L4);
        L.add(L5);
        L.add(L6);
        L.add(L7);
        L.add(L8);
        for (int i=0; i<L.size();i++){
            Label x= L.get(i);
            x.setText(nofnLeikmanna.get(i));
        }
    }
    public void initialize() {
        setL();
        nofnLeikmanna.addAll(Leik);
        verkefnastjori();
        setLabel();
        kosningar();
        fela();
    }
    public void verkefnastjori(){
        String v = nofnLeikmanna.get(rod);
        ritaraListi(v);
        rod++;
        if(rod==8){
            rod=0;
        }
        fxTextVerk.setText( v+" er verkefnastjóri. "+v +" velur ");
    }
    public void ritaraListi(String v){
        ObservableList<String> s = FXCollections.observableArrayList();
        for(String a:nofnLeikmanna){
            if(!Objects.equals(a, v)){
                s.add(a);
            }
        }
        fxListRitara.setItems(s);
        fxListRitara.setDisable(false);
        fxListRitara.setOnAction(e->{
            if(fxListRitara.getSelectionModel().getSelectedItem()!=null){
                fxListRitara.setDisable(true);
            }
        });
    }
   public void kosningar(){
       j=0;
       n=0;
       ObservableList<HBox> kos=FXCollections.observableArrayList();
       kos.add(V1);
       kos.add(V2);
       kos.add(V3);
       kos.add(V4);
       kos.add(V5);
       kos.add(V6);
       kos.add(V7);
       kos.add(V8);
       for(HBox h :kos){
           h.getChildren().clear();
       }
       for(HBox h :kos){
           h.getChildren().clear();
           Button ja = new Button("Já");
           ja.setId("Ja");
           Button nei = new Button("Nei");
           nei.setId("Nei");
           ja.setOnAction(e -> {
               if(fxListRitara.getSelectionModel().getSelectedItem()!=null){
                   j++;
                   h.getChildren().removeAll(ja,nei);
               }
               else {
                   Alert a = DadVantarRitaraAlert();
                   a.showAndWait();
               }
           });
           nei.setOnAction(e -> {
               if(fxListRitara.getSelectionModel().getSelectedItem()!=null){
                   n++;
                   h.getChildren().removeAll(ja,nei);
               }
               else {
                   Alert a = DadVantarRitaraAlert();
                   a.showAndWait();
               }
           });
           h.getChildren().addAll(ja, nei);
       }
    }
    public Alert DadVantarRitaraAlert(){
        ButtonType bType = new ButtonType("Í lagi", ButtonBar.ButtonData.OK_DONE);
        String n="";
        Alert a = new Alert(Alert.AlertType.NONE,  "Það þarf að velja ritara áður en það er kosið", bType);
        a.setHeaderText("Það vantar ritara");
        return a;
    }

    public void fjoldiatkvaeda(boolean boo){
        ButtonType bType = new ButtonType("Í lagi",
                ButtonBar.ButtonData.OK_DONE);
        String text;
        if(!boo){
            text="Það þurfa allir að fá að kjósa áður en að spil er dregið.";
        }
        else {
            text="Meirihlutinn kaus gegn því að leyfa verkefnastjóranum og ritaranum að leggja niður spil.\nNú er kominn nýr verkefnastjóri sem má velja sér ritara.";
        }
        Alert a = DragaSpilAlert(bType,text);
        a.showAndWait();
    }
    public void DragaSpil() {
        if(j+n!=8){
            fjoldiatkvaeda(false);
            return;
        }
        if(n>3){
            fjoldiatkvaeda(true);
            DragaSpilinitialize();
            return;
        }
        DragaSpilinitialize();
        ViewSwitcher.switchTo(View.VERKS);
    }
    public void DragaSpilinitialize(){
        fxListRitara.setItems(null);
        kosningar();
        verkefnastjori();

    }
    private Alert DragaSpilAlert(ButtonType bILagi,String text) {
        String n="";
        Alert a = new Alert(Alert.AlertType.NONE,  n, bILagi);
        a.setHeaderText(text);
        return a;
    }
    public void reglurnar() {
        ViewSwitcher.switchTo(View.MAINREGLUR);
    }
    public void tilBaka(){ ViewSwitcher.switchTo(View.HLUTVERK);}
    public void lagtABord(String s) {
        String[] v;
        if (Objects.equals(s, "B")) {
            for (Pane pane : B) {
                if (!pane.isVisible()) {
                    pane.setVisible(true);
                    return;
                }
            }
            v=L.getBlar();
            Alert a = Vinna(v);
            a.showAndWait();
            System.exit(0);
        }
        if (Objects.equals(s, "G")) {
            for (Pane pane : G) {
                if (!pane.isVisible()) {
                    pane.setVisible(true);
                    return;
                }
            }
            v=L.getGraen();
            Alert a = Vinna(v);
            a.showAndWait();
            System.exit(0);
        }
    }
    ObservableList<Pane> B = FXCollections.observableArrayList();
    ObservableList<Pane> G = FXCollections.observableArrayList();
    public void fela(){
        B.add(B0);
        B.add(B1);
        B.add(B2);
        B.add(B3);
        B.add(B4);
        B.add(B5);
        B.add(B6);
        G.add(G0);
        G.add(G1);
        G.add(G2);
        G.add(G3);
        G.add(G4);
        G.add(G5);
        G.add(G6);
        for(Pane pane:B){
            pane.setVisible(false);
        }
        for(Pane pane:G){
            pane.setVisible(false);
        }
    }

    private Alert Vinna(String [] v) {
        String[] G=L.getGraen();
        String s="Til hamingju ";
        for (String a:v){
            s=s+a+ ", ";
        }
        s=s+"\nÞið unnuð leikinn!"+"\n"+G[0]+" var vegan og "+G[1]+" var úlfurinn";
        ButtonType bType = new ButtonType("Í lagi" , ButtonBar.ButtonData.OK_DONE);
        Alert a = new Alert(Alert.AlertType.NONE, s, bType);
        a.setTitle("Vegan í felum");
        return a;
    }

}



