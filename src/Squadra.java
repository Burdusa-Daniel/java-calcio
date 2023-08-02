import java.util.ArrayList;

public class Squadra {
    private ArrayList<Giocatore> giocatori;
    public Squadra() {
        this.giocatori=new ArrayList<>();
    }
    public void addGiocatore( Giocatore giocatore){
        giocatori.add(giocatore);
    }
}
