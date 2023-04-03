package hi.is.vidmot.veganifel;

public class mainController {
    private boolean vote;
    public Leikmenn L;
    public void mainController(){
        vote=false;

    }

    public void setL(Leikmenn l) {
        L = l;
    }

    public void DragaSpil() {
        if (vote){
            ViewSwitcher.switchTo(View.VERKS);
        }
    }
    public void kosningar(){

    }
    public void initialize(){


    }
}
