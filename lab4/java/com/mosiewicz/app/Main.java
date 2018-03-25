package com.mosiewicz.app;

import com.mosiewicz.builder.DataProvider;
import com.mosiewicz.exception.MyException;
import com.mosiewicz.model.Country;
import com.mosiewicz.model.Requirement;
import com.mosiewicz.model.User;

import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by Magda on 23.03.2018.
 */
public class Main {

    public static void main(String args[]) {
        start();
    }


    private static void start() {

        DataProvider.prepareCityData();
        List<Country> countries = DataProvider.prepareCountryData();
        for (Country country : countries) {
            country.print();
        }

        User user= new User();

        try {
            user.setData();
        }catch (MyException e){
            System.out.println("Niepoprawna formuła adresu email!");
        }

        Requirement requirement = new Requirement();
        try {
            requirement.setRequirements();
        } catch (InputMismatchException exception) {
            System.out.println("Niedozwolony znak, wprowadź liczbę!");
        } catch (ArithmeticException exception) {
            System.out.println("Liczba spoza zakresu! Podaj dodatnie wartości ");
        }

        System.out.println();
        requirement.proposePlace(countries);

    }
}




