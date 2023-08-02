import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private int eta;
    private String nome;

    public Persona(int eta, String nome) {
        this.eta = eta;
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   /* public int etaPersona(){
        Period anni = Period.between(dataNascita,LocalDate.now());
        return anni.getYears();
    }*/

    @Override
    public String toString() {
        return
                "eta=" + eta +
                " nome=" + nome  ;
    }
}
