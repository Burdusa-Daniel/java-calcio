public class Giocatore extends Persona{
    private int numeroMaglia;
    private String ruolo;

    public Giocatore(int eta, String nome, int numeroMaglia, String ruolo) {
        super(eta, nome);
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

    @Override
    public String toString() {
        return super.toString()+"\nruolo="+" " + ruolo + "\nnumero maglia=" + " "+ numeroMaglia;
    }
}
