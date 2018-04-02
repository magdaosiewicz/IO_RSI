package com.mosiewicz.builder;

import com.mosiewicz.model.City;
import com.mosiewicz.model.Country;

import java.util.List;

public class CountryBuilder {

    private Country country;

    public CountryBuilder() {
        country = new Country();
    }

    public CountryBuilder accessToTheSea(boolean accesToTheSea) {
        country.setAccesToTheSea(accesToTheSea);
        return this;
    }

    public CountryBuilder climate(String climate) {
        country.setClimat(climate);
        return this;
    }

    public CountryBuilder timeZone(String timeZone) {
        country.setTimeZone(timeZone);
        return this;
    }

    public CountryBuilder cities(List<City> cities) {
        country.setCities(cities);
        return this;
    }

    public CountryBuilder name(String name) {
        country.setName(name);
        return this;
    }

    public CountryBuilder priceForDay(Double priceForDay) {
        country.setPriceForDay(priceForDay);
        return this;
    }

    public CountryBuilder levelOfPopulation(Double levelOfPopulation) {
        country.setLevelOfPopulation(levelOfPopulation);
        return this;
    }

    public CountryBuilder surface(Double surface) {
        country.setSurface(surface);
        return this;
    }

    public Country build() {
        return country;
    }
}