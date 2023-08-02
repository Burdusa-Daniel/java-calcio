import java.time.LocalDate;
import java.time.Period;

public class Giocatore extends Persona{
    private int numeroMaglia;
    private String ruolo;

    public Giocatore(LocalDate dataNacita, String nome,int numeroMaglia, String ruolo) {
        super(dataNacita, nome);
        this.numeroMaglia=numeroMaglia;
        this.ruolo=ruolo;
    }

    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    public void setNumeroMaglia(int numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

}
