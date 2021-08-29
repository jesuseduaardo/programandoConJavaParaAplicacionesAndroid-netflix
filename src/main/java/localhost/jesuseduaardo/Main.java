package localhost.jesuseduaardo;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Pelicula lordOfTheRings = new Pelicula("Lord of the rings", "Peter Jackson");
        Pelicula inception = new Pelicula("Inception", "Christopher Nolan");
        Pelicula forrestGump = new Pelicula("Forrest Gump", "Winston Groom", "Drama", 1993, "142min/12seg");
        Pelicula fightClub = new Pelicula("Fight Club", "David Fincher", "Drama", 1999, "130min/45seg");
        Pelicula theDarkKnight = new Pelicula("The Dark Knight", "Christopher Nolan");

        fightClub.setVisto(true);
        theDarkKnight.setVisto(true);

        Pelicula[] peliculas = {lordOfTheRings, inception, forrestGump, fightClub, theDarkKnight};

        Serie breakingBad = new Serie("Breaking Bad", "Vince Gilligan", 5, "Drama",
                2008, "45min/00seg");
        Serie betterCallSaul = new Serie("Better Call Saul", "Vince Gilligan", 6, "Drama",
                2015, "60min/00seg");
        Serie theWitcher = new Serie("The Witcher", "Lauren Schmidt Hissrich");
        Serie thePunisher = new Serie("The Punisher", "Steve Lightfoot");
        Serie mindhunter = new Serie("Mindhunter", "David Fincher, Asif Kapadia, Tobias Lindholm y Andrew Douglas",
                2, "Drama", 2007, "60min/00seg");

        breakingBad.setVisto(true);
        betterCallSaul.setVisto(true);

        Serie[] series = {breakingBad, betterCallSaul, theWitcher, thePunisher, mindhunter};

        System.out.println("**Peliculas visualizadas**");
        int yearActual = Calendar.getInstance().get(Calendar.YEAR);
        Pelicula masReciente = new Pelicula();
        Serie conMasTemporadas = new Serie();
        for (int i = 0; i < peliculas.length; i++) {

            if (peliculas[i].getYear() > masReciente.getYear()) {
                masReciente = peliculas[i];
            }
            if (peliculas[i].isVisto()) {
                System.out.println("- " + peliculas[i]);
            }
        }
        System.out.println("**Series visualizadas**");
        for (int i = 0; i < series.length; i++) {
            if(series[i].getNoTemporadas() > conMasTemporadas.getNoTemporadas()){
                conMasTemporadas = series[i];
            }
            if (series[i].isVisto()) {
                System.out.println("- " + series[i]);
            }
        }

        System.out.println("Pelicula más reciente " +masReciente);
        System.out.println("Serie con más temporadas " +conMasTemporadas);

    }
}
