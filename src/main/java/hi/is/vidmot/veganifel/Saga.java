package hi.is.vidmot.veganifel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Saga {
    @FXML
    private Label fxText;
    public void initialize(){
        String s="Það er verið að fara að byggja kjötgeymslu í bænum. Það þarf að ráða fólk í verkið. \n" +
                "Það voru ráðnir 8  íbúar bæjarins til að sjá um að ráða rétta fólkið við byggingu nýju kjötgeymslunar. \n" +
                "Eftir að þau voru ráðin komst það upp að eitt þeirra væri vegan og eitt þeirra væri úlfur í dulargervi.\n" +
                "Þar sem að það vor enginn sönnunargögn eða vitað hverjir þeirra gætu verið sá seku var ekkert gert í því. \n" +
                "Þessir einstaklingar hafa val um að ráða smið eða krakkana til að byggja kjötgeymsluna.\n" +
                "Það er mun ódýrara að ráða krakka svo að sá sem er vegan og úlfur munu vilja ráða þau í verkið.\n" +
                "Þar sem vegan vill ekki sóa peningum í kjöt og úlfurinn vill geta auðveldlega brotist inn eftir að verkinu er lokið.\n" +
                "Þau sem eru alætur vilja að verkið verði vel unnið svo að þau vilja ráða smið í verkið. \n" +
                "Í hverri umferð verður eitt þeirra verkefnastjóri sem fær inn tilboð frá smið og krökkum.\n"+
                "Verkefnastjórinn fær 3 tilboð í hverri umferð verður svo að gefa ritaranum sínum 2 þeirra.\n" +
                "Ritarinn velur svo eitt þerra til að leggja á borðið. \n";
        fxText.setText(s);

    }
    public void Next(){
        ViewSwitcher.switchTo(View.HLUTVERK);
    }
}
