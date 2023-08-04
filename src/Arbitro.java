public class Arbitro extends Persona {
    private String ruolo;

    public Arbitro(int eta, String nome, String ruolo) {
        super(eta, nome);
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return super.toString()+" ruolo "+ruolo;
    }
}
