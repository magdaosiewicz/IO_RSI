package com.mosiewicz.builder;

import com.mosiewicz.model.City;
import com.mosiewicz.model.Country;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Magda on 24.03.2018.
 */
public class DataProvider {

    public static HashMap<String, List<City>> prepareCityData() {
        HashMap<String, List<City>> countryCity = new HashMap<>();


        List<City> citiesM = new ArrayList<>();
        List<City> citiesW = new ArrayList<>();
        List<City> citiesN = new ArrayList<>();
        List<City> citiesI = new ArrayList<>();
        List<City> citiesH = new ArrayList<>();
        List<City> citiesF = new ArrayList<>();
        List<City> citiesNi = new ArrayList<>();

        City city = City.builder()
                .name("Valetta")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .additionalInformation("capital")
                .build();

        City city1 = City.builder()
                .name("Marsaxlokk")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesM.add(city);
        citiesM.add(city1);
        countryCity.put("Malta", citiesM);

        City city2 = City.builder()
                .name("Dublin")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .additionalInformation("capital")
                .build();

        City city3 = City.builder()
                .name("Limerick")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesI.add(city2);
        citiesI.add(city3);
        countryCity.put("Irlandia", citiesI);

        City city4 = City.builder()
                .name("Oslo")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .additionalInformation("capital")
                .build();

        City city5 = City.builder()
                .name("Bergen")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesN.add(city4);
        citiesN.add(city5);
        countryCity.put("Norwegia", citiesN);

        City city6 = City.builder()
                .name("Neapol")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .build();

        City city7 = City.builder()
                .name("Rzym")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(388.0)
                .build();

        citiesW.add(city6);
        citiesW.add(city7);
        countryCity.put("Włochy", citiesW);

        City city8 = City.builder()
                .name("Paryż")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .additionalInformation("capital")
                .build();

        City city9 = City.builder()
                .name("Tuluza")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesF.add(city8);
        citiesF.add(city9);
        countryCity.put("Francja", citiesF);

        City city10 = City.builder()
                .name("Berlin")
                .priceForDay(376.0)
                .surface(109005.0)
                .levelOfPopulation(34000000.0)
                .additionalInformation("capital")
                .build();

        City city11 = City.builder()
                .name("Dortmund")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesNi.add(city10);
        citiesNi.add(city11);
        countryCity.put("Niemcy", citiesNi);

        City city12 = City.builder()
                .name("Madryt")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .additionalInformation("capital")
                .build();

        City city13 = City.builder()
                .name("Barcelona")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesH.add(city12);
        citiesH.add(city13);
        countryCity.put("Hiszpania", citiesH);



        return countryCity;
    }


    public static List<Country> prepareCountryData() {
        List<Country> countries = new ArrayList<>();

        Country country = Country.builder()
                .name("Włochy")
                .priceForDay(587.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Włochy"))
                .build();
        Country country1 = Country.builder()
                .name("Malta")
                .priceForDay(987.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Malta"))
                .build();
        Country country2 = Country.builder()
                .name("Norwegia")
                .priceForDay(387.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Norwegia"))
                .build();
        Country country3 = Country.builder()
                .name("Irlanda")
                .priceForDay(987.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Irlandia"))
                .build();
        Country country4 = Country.builder()
                .name("Hiszpania")
                .priceForDay(787.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Hiszpania"))
                .build();
        Country country5 = Country.builder()
                .name("Francja")
                .priceForDay(987.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Francja"))
                .build();
        Country country6 = Country.builder()
                .name("Niemcy")
                .priceForDay(10087.0)
                .levelOfPopulation(877009900.0)
                .surface(87600009.0)
                .accessToTheSea(true)
                .cities(findCities("Niemcy"))
                .timeZone("UTC + 01:00")
                .climate("umiarkowany z chłodnymi, pochmurnymi i mokrymi zimami i latami")
                .build();

        countries.add(country);
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);


        return countries;
    }


    public static List<City> findCities(String countryName){
        for(String key: prepareCityData().keySet()){
            if(key.equals(countryName)){
                return prepareCityData().get(key);
            }
        }
        System.err.println("!");
        return null;
    }


}
