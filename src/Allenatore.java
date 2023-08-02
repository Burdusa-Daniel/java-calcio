import java.time.LocalDate;

public class Allenatore extends Persona{
    private String tattica;
    public Allenatore(int eta, String nome, String tattica) {
        super(eta, nome);
        this.tattica=tattica;
    }

    public String getTattica() {
        return tattica;
    }

    public void setTattica(String tattica) {
        this.tattica = tattica;
    }

    @Override
    public String toString() {
        return super.toString()+"tattica"+tattica;
    }
}
