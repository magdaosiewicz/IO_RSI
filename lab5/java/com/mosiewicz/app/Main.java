package com.mosiewicz.app;

import com.mosiewicz.builder.DataProvider;
import com.mosiewicz.exception.MyException;
import com.mosiewicz.model.Country;
import com.mosiewicz.model.Requirement;
import com.mosiewicz.model.User;

import java.io.IOException;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.List;


/**
 * Created by Magda on 23.03.2018.
 */
public class Main implements Serializable {



    public static void main(String args[]) throws IOException, ClassNotFoundException  {
        start();
    }
    private static void start() throws IOException, ClassNotFoundException  {

        DataProvider.loadData();
        for(String key:  DataProvider.loadData().keySet()){
            System.out.println(key + " -- "+ DataProvider.loadData().get(key));
        }

        DataProvider dataProvider= new DataProvider();
        DataProvider.prepareCityData();
        List<Country> countries = dataProvider.prepareCountryData();
        dataProvider.saveData(countries);
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

//       // DataProvider serializabledDataProvider = new DataProvider();
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("countries.bin"))) {
//            objectOutputStream.writeObject(dataProvider);
//        }
//
//        // TEST DESERIALIZACJI
//
//        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("countries.bin"));
//        try {
//            DataProvider readDataProvider = (DataProvider) inputStream.readObject();
//            System.out.println(readDataProvider.countries.get(0).getName());
//            // System.out.println(readDataProvider.countries.get(0).getLevelOfPopulation());
//
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }





    }
}




