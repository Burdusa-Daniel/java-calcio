
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

         String[] NOMI_COGNOMI_GIOCATORI = {
                "Marco Rossi", "Alessio Bianchi", "Lorenzo Russo", "Simone Ferrara", "Andrea Martini",
                "Luca Rossetti", "Davide Fontana", "Giovanni Ricci", "Filippo Bellini", "Nicolas De Luca",
                "Emanuele Gallo", "Matteo Rossi", "Paolo Marini", "Riccardo Leone", "Tommaso Vitale",
                "Enrico Longo", "Lorenzo Gatti", "Mattia Barbieri", "Pietro Greco", "Luigi Fiore",
                "Dario Lombardi", "Andrea Mariani", "Fabio Serra", "Stefano Ruggiero", "Davide Palumbo",
                "Nicola Lombardi", "Michele Russo", "Alessio D'Amico", "Gianluca Santoro", "Nicolas Lombardi",
                "Fabrizio Marino", "Simone Barone", "Daniele Pellegrini", "Roberto Mariani", "Andrea Rizzi",
                "Matteo Moretti", "Davide Barbieri", "Stefano Bianchi", "Pietro Marchetti", "Nicolas Santoro",
                "Marco Monti", "Giovanni Martino", "Lorenzo Galli", "Alessandro Marchetti", "Luca Coppola",
                "Davide Palmieri", "Giacomo Leone", "Matteo Santoro", "Fabrizio Marino", "Gianluca Fontana",
                "Alessandro De Angelis", "Leonardo Sorrentino", "Davide Farina", "Federico Romano",
                "Simone Rinaldi", "Francesco Esposito", "Luca Vitale", "Domenico Ferrara", "Antonio Martini",
                "Mario Rossetti", "Angelo Coppola", "Carmine Bellini", "Vincenzo Ricci", "Salvatore Greco",
                "Giovanni Marchetti", "Francesco Barbieri", "Raffaele Lombardi", "Federico Bianchi",
                "Emanuele Pellegrini", "Alessio Marino", "Stefano De Rosa", "Lorenzo Santoro",
                "Gianluca De Luca", "Alberto Monti", "Gabriele Martino", "Roberto Galli", "Matteo Ferri",
                "Alessandro Mariani", "Antonio Vitale", "Nicola Romano", "Massimo Palmieri", "Daniele Ferrari",
                "Vincenzo Greco", "Salvatore Moretti", "Davide Santoro", "Riccardo Marini", "Leonardo Fiore",
                "Angelo Ruggiero", "Carmine Sorrentino", "Emanuele Farina", "Francesco Rinaldi",
                "Luigi Esposito", "Domenico Vitale", "Antonio De Angelis", "Mario Barbieri", "Giovanni Marchetti",
                "Francesco Russo", "Raffaele Martini", "Federico Coppola", "Emanuele Bellini", "Alessio Ricci"
        };
        Random random = new Random();

        Giocatore giocatore=null;

        //11 giocatori

         for (int i = 0 ; i<11;i++){

             //nome gicatore

            int indiceCasuale1 = random.nextInt(0, NOMI_COGNOMI_GIOCATORI.length);
            String nomeGiocatore = NOMI_COGNOMI_GIOCATORI[indiceCasuale1];

            //eta

            int eta = random.nextInt(16, 41);

            //numeromaglia

            int numeroMaglia = random.nextInt(1, 100);

            //ruoli

            String[] ruoli = {"POR", "DC", "DC", "TD", "TS", "CM", "CM", "CM", "AD", "AS", "ATT"};
            int posizione = (random.nextInt(0, ruoli.length));
            String ruoloInCampo = ruoli[posizione];

            //stampa giocatore

            System.out.println("Giocatore");
            giocatore = new Giocatore(eta, nomeGiocatore, numeroMaglia, ruoloInCampo);
            System.out.println(giocatore.toString());
        }

         //nome allenatore

        int indiceCasuale2 = random.nextInt(0, NOMI_COGNOMI_GIOCATORI.length);
        String nomeAllenatore = NOMI_COGNOMI_GIOCATORI[indiceCasuale2];

        //eta allenatore

        int etaAllenatore = random.nextInt(30, 70);

        //tattica allenatore

        String[] tattica = {"tiki taka ", "possesso palla", "palla lunga", "rientrare in difesa", "parcheggia il bus"};
        int a = random.nextInt(0, tattica.length);
        String stileDiGioco = tattica[a];

        //allenatore

        System.out.println("L'allenatore è:");
        Allenatore allenatore = new Allenatore(etaAllenatore, nomeAllenatore, stileDiGioco);
        System.out.println(allenatore.toString());

        //arbitro

        //etaarbitro

        int etaAlbiltro = random.nextInt(30, 45);

        //nomearbitro

        int indiceCasuale3 = random.nextInt(0, NOMI_COGNOMI_GIOCATORI.length);
        String nomeArbitro = NOMI_COGNOMI_GIOCATORI[indiceCasuale3];

        //ruoloarbitro

        String[] ruoloArbitro = {"principale","secondo","guardalinee","principale VAR", "secondo VAR"};
        int b = random.nextInt(0, ruoloArbitro.length);
        String arbitroRuolo = ruoloArbitro[b];

        //stampaarbitro
        System.out.println("l'arbitro è :");
        Arbitro arbitro= new Arbitro(etaAlbiltro,nomeArbitro,arbitroRuolo);
        System.out.println(arbitro.toString());

        //partita

        Squadra squadra1= new Squadra("FCBoccaGrande");
        Squadra squadra2= new Squadra("FCBoccaPiccola");
        boolean papi=false;
        int gol= 0;
        Partita finaleUCL=new Partita(squadra1,squadra2,arbitro,papi,gol);
        finaleUCL.iniziaPartita();
        finaleUCL.golmarcato();
        finaleUCL.golmarcato();
        finaleUCL.golmarcato();
        finaleUCL.finePartita();

    }
}
