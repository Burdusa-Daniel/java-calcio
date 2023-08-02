import java.time.LocalDate;

public class Allenatore extends Persona{
    private String tattica;
    public Allenatore(LocalDate dataNascita, String nome, String tattica) {
        super(dataNascita, nome);
        this.tattica=tattica;
    }

    public String getTattica() {
        return tattica;
    }

    public void setTattica(String tattica) {
        this.tattica = tattica;
    }
}
