/**
 * Created by Magda on 11.03.2018.
 */
public class Country {

    protected String nameOfCountry;
    protected String nameOfCapital;
    protected String City [] = new String[2];
    protected double priceForDay;
    protected boolean accesToTheSea;

    public Country(String nameOfCountry, String nameOfCapital, String[] city, double priceForDay, boolean accesToTheSea) {
        this.nameOfCountry = nameOfCountry;
        this.nameOfCapital = nameOfCapital;
        City = city;
        this.priceForDay = priceForDay;
        this.accesToTheSea = accesToTheSea;
    }


    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public String getNameOfCapital() {
        return nameOfCapital;
    }

    public void setNameOfCapital(String nameOfCapital) {
        this.nameOfCapital = nameOfCapital;
    }

    public String[] getCity() {
        return City;
    }

    public void setCity(String[] city) {
        City = city;
    }

    public double getPriceForDay() {
        return priceForDay;
    }

    public void setPriceForDay(double priceForDay) {
        this.priceForDay = priceForDay;
    }

    public boolean isAccesToTheSea() {
        return accesToTheSea;
    }

    public void setAccesToTheSea(boolean accesToTheSea) {
        this.accesToTheSea = accesToTheSea;
    }


}
