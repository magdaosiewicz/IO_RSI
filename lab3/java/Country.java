import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Magda on 23.03.2018.
 */
public class Country extends Place implements Print{

    protected boolean accesToTheSea;
    protected String climat;
    protected String timeZone;
    protected List<City> cities = new ArrayList<>();

    public Country() {
    }

    public Country(String name, Double priceForDay, Double levelOfPopulation, Double surface, boolean accesToTheSea, String climat, String timeZone, List<City> cities) {
        super(name, priceForDay, levelOfPopulation, surface);
        this.accesToTheSea = accesToTheSea;
        this.climat = climat;
        this.timeZone = timeZone;
        this.cities = cities;
    }

    public boolean isAccesToTheSea() {
        return accesToTheSea;
    }

    public void setAccesToTheSea(boolean accesToTheSea) {
        this.accesToTheSea = accesToTheSea;
    }

    public String getClimat() {
        return climat;
    }

    public void setClimat(String climat) {
        this.climat = climat;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }



    public static CountryBuilder builder() {
        return new CountryBuilder();
    }



    @Override
    public void print() {

        System.out.println("COUNTRY: " + name + "\n-----------------------------------\n priceForDay: "  + priceForDay + "zł | levelOfPopulation: " + levelOfPopulation + "\n surface: " + surface + " km^2  |  accesToTheSea: " + accesToTheSea + " |  climat: " + climat + "  |  timeZone: " + timeZone + "\n");
        for(City city: cities){
            city.print();
        }
        System.out.println();
    }

}
