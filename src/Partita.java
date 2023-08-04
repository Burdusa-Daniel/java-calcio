import java.util.Random;

public class Partita {
    Squadra casa;
    Squadra ospite;
    Arbitro Poppo;
    private boolean isIniziata;
    private int gol;

    public Partita(Squadra casa, Squadra ospite, Arbitro poppo,boolean isIniziata, int gol) {
        this.casa = casa;
        this.ospite = ospite;
        Poppo = poppo;
        this.isIniziata= false;
        this.gol=0;
    }

    public void iniziaPartita(){
        this.isIniziata=true;
        System.out.println("il calcio d'inizio");
    }

    public void golmarcato(){
        if(!isIniziata){
            System.out.println("errore");
        }
        Random rdm= new Random();
        Boolean haMarcato=rdm.nextBoolean();
        if(haMarcato){
            System.out.println("ha segnato la squadra :"+casa.getNome());
            gol++;
            System.out.println(gol);
        }else {
            System.out.println("ha segnato la squadra :"+ospite.getNome());
            gol++;
            System.out.println(gol);
        }
    }
    public void finePartita(){
        this.isIniziata=false;
        System.out.println("fine partita");
    }
}
