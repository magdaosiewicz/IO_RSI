import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Created by Magda on 23.03.2018.
 */
@AllArgsConstructor
@NoArgsConstructor
public abstract class Place{

    protected String name;
    protected Double priceForDay;
    protected Double levelOfPopulation;
    protected Double surface;


    public String getName() {
        return name;
    }

    public Place name(String name) {
        this.name = name;
        return this;
    }

    public Double getPriceForDay(Place place) {

        return priceForDay;
    }

    public Place priceForDay(Double priceForDay) {
        this.priceForDay = priceForDay;
        return this;
    }

    public Double getLevelOfPopulation() {
        return levelOfPopulation;
    }

    public Place levelOfPopulation(Double levelOfPopulation) {
        this.levelOfPopulation = levelOfPopulation;
        return this;
    }

    public Double getSurface() {
        return surface;
    }

    public Place surface(Double surface) {
        this.surface = surface;
        return this;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceForDay(Double priceForDay) {
        this.priceForDay = priceForDay;
    }

    public void setLevelOfPopulation(Double levelOfPopulation) {
        this.levelOfPopulation = levelOfPopulation;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }
}
