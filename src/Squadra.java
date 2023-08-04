import java.util.ArrayList;

public class Squadra {
    private ArrayList<Giocatore> giocatori;
    private String nome;
    public Squadra(String nome) {
        this.giocatori=new ArrayList<>();
        this.nome=nome;
    }
    public void addGiocatore( Giocatore giocatore){
        giocatori.add(giocatore);
    }

    public String getNome() {
        return nome;
    }
}
