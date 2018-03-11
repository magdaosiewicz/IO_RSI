import java.util.Scanner;

/**
 * Created by Magda on 11.03.2018.
 */
public class Requirement {

    private int numberOfPassengers;
    private int numberOfDays;
    private boolean accesToTheSea;
    private double budget;

    public void setRequirements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("WYPEŁNIJ FORMULARZ:  ");
        System.out.println("------------------------------------");
        System.out.println("LICZBA PASAŻERÓW: ");
        numberOfPassengers = scanner.nextInt();
        System.out.println("LICZBA DNI: ");
        numberOfDays = scanner.nextInt();
        System.out.println("TWÓJ BUDŻET: ");
        budget = scanner.nextDouble();
        System.out.println("DOSTĘP DO MORZA (true/false): ");
        accesToTheSea = scanner.nextBoolean();

    }

    public Country[] proposeTown(Country[] tablica) {
        Country[] tabC = new Country[7];
        for (int i = 0; i < 7; i++) {
            if (tablica[i].getPriceForDay() * numberOfDays * numberOfPassengers <= budget) {
                tabC[i] = tablica[i];
                System.out.println("Całkowity koszt wyjazdu do: " + tablica[i].getNameOfCountry() + " wyniesie: " +
                        tablica[i].getPriceForDay() * numberOfDays * numberOfPassengers + "zł.");
            } else {
                System.out.println("Niestety nie stać Cię na wyjazd do: " + tablica[i].getNameOfCountry() +
                        ". Zabraknie Ci tylko: " + ((tablica[i].getPriceForDay() * numberOfDays * numberOfPassengers)-budget) + "zł.");
            }
        }
        return tabC;
    }


}


