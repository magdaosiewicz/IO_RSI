import java.util.Scanner;

/**
 * Created by Magda on 11.03.2018.
 */
public class Main {

    public static void main(String args[]) {


        String tabG[] = new String[2];
        tabG[0] = "Dortmud";
        tabG[1] = "Frankfurt";
        String tabF[] = new String[2];
        tabF[0] = "Tuluza";
        tabF[1] = "Lyon";
        String tabH[] = new String[2];
        tabH[0] = "Barcelona";
        tabH[1] = "Walencja";
        String tabI[] = new String[2];
        tabI[0] = "Limerick";
        tabI[1] = " Cork";
        String tabN[] = new String[2];
        tabN[0] = "Bergen";
        tabN[1] = "Kristiansand";
        String tabM[] = new String[2];
        tabM[0] = " Marsaxlokk";
        tabM[1] = "Mgarr";
        String tabW[] = new String[2];
        tabW[0] = "Neapol";
        tabW[1] = " Palermo";

        Country tabCountry[] = new Country[7];
        tabCountry[0] = new Country("Niemcy", "Berlin", tabG, 100, true);
        tabCountry[1] = new Country("Francja", "Paryż", tabF, 200, true);
        tabCountry[2] = new Country("Hiszpania", "  Madryt", tabH, 220, true);
        tabCountry[3] = new Country("Irlandia", "   Dublin", tabI, 500, true);
        tabCountry[4] = new Country("Norwegia", "  Oslo", tabN, 300, true);
        tabCountry[5] = new Country("Malta", "  Valetta", tabM, 90, true);
        tabCountry[6] = new Country(" Wlochy", "  Rzym", tabW, 130, true);


        String tablica[][] = new String[4][tabCountry.length];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < tabCountry.length; j++) {
                tablica[0][j] = tabCountry[j].getNameOfCountry();
                tablica[1][j] = tabCountry[j].getNameOfCapital();
                tablica[2][j] = tabCountry[j].getCity()[0];
                tablica[3][j] = tabCountry[j].getCity()[1];
            }
        }

        System.out.println("     MIASTA-PAŃSTWA EUROPEJSKIE:");
        System.out.println("--------------------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < tabCountry.length; j++) {
                System.out.print(tablica[i][j] + "   ");
            }
            System.out.println();
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
        Country [] tablicaCountries= new Country[7];
        tablicaCountries= requirement.proposeTown(tabCountry);


    }
}
