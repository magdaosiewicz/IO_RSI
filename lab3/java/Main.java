import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by Magda on 23.03.2018.
 */
public class Main {

    public static void main(String args[]) {
        start();
    }


    public static void start() {

        DataProvider.prepareCityData();
        List<Country> countries = DataProvider.prepareCountryData();
        for(Country country: countries){
            country.print();
        }

        System.out.println();
        Scanner scanner= new Scanner(System.in);
        User user = new User();
        System.out.println("Podaj name, nazwisko i adres e-mail: ");
        user.name = scanner.nextLine();
        user.nazwisko= scanner.nextLine();
        user.email= scanner.nextLine();

        Requirement requirement= new Requirement();
        requirement.setRequirements();
        System.out.println();
        requirement.proposePlace(countries);

    }
}




