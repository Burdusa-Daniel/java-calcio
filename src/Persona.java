import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private LocalDate dataNascita;
    private String nome;

    public Persona(LocalDate dataNascita, String nome) {
        this.dataNascita = dataNascita;
        this.nome = nome;
    }

    public LocalDate getEta() {
        return dataNascita;
    }

    public void setEta(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int etaPersona(){
        Period anni = Period.between(dataNascita,LocalDate.now());
        return anni.getYears();
    }
}
