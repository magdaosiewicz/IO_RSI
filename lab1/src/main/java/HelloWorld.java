import java.util.Scanner;

/**
 * Created by Magda on 07.03.2018.
 */
public class HelloWorld {

    public static void main(String args[]){

        Scanner scanner= new Scanner(System.in);
        User user=new User();

        System.out.println("Podaj imię, nazwisko i numer indeksu: ");
        user.name=scanner.nextLine();
        user.surname=scanner.nextLine();
        user.indexNumber=scanner.nextInt();

        System.out.println("Użytkownik: "+ user.name+ " "+ user.surname);
        System.out.println("Numer indeksu: "+user.indexNumber);
        System.out.print("Hello World!");

    }

}
