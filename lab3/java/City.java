import lombok.Builder;

/**
 * Created by Magda on 23.03.2018.
 */
public class City extends Place implements Print {

    private String additionalInformation;


    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @Builder
    public City(String additionalInformation, String name, Double priceForDay, Double levelOfPopulation, Double surface) {
        super(name, priceForDay, levelOfPopulation, surface);
        this.additionalInformation = additionalInformation;
    }

    @Override
    public void print() {
        if(additionalInformation==null){
            additionalInformation="-";
        }
        System.out.println("CITY: " + name + /* "\npriceForDay: " + priceForDay +  "zł" + "\n */ " additionalInformation:"  +  additionalInformation);

    }
}
