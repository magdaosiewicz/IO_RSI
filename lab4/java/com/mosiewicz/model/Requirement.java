package com.mosiewicz.model;

import com.mosiewicz.model.Country;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Magda on 24.03.2018.
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
        boolean correctA = false;
        while (!correctA) {
            try {
                numberOfPassengers = scanner.nextInt();
                if (numberOfPassengers > 0) {
                    correctA = true;
                } else {
                    throw new ArithmeticException();
                }
                System.out.println("LICZBA DNI: ");
                numberOfDays = scanner.nextInt();
                if (numberOfDays > 0) {
                    correctA = true;
                } else {
                    throw new ArithmeticException();
                }
                System.out.println("TWÓJ BUDŻET: ");
                budget = scanner.nextDouble();
                if (budget >= 0) {
                    correctA = true;
                } else {
                    throw new ArithmeticException();
                }
                System.out.println("DOSTĘP DO MORZA (true/false): ");
                accesToTheSea = scanner.nextBoolean();

            }catch (ArithmeticException e){
                System.out.println("Liczba spoza zakresu! Podaj dodatnie wartości ");

            }
        }
    }


    public void proposePlace(List<Country> countries) {
        for (
                Country country : countries) {
            if (country.priceForDay * numberOfPassengers * numberOfDays <= budget) {
                System.out.println("Całkowity koszt wyjazdu do: " + country.name + " wyniesie: " + country.priceForDay * numberOfDays * numberOfPassengers + "zł.");
            } else {
                System.out.println("Niestety nie stać Cię na wyjazd do: " + country.name + ". Zabraknie Ci tylko: " + ((country.priceForDay * numberOfDays * numberOfPassengers) - budget) + "zł.");
            }
        }
    }

}
