package com.mosiewicz.model; /**
 * Created by Magda on 24.03.2018.
 */

import com.mosiewicz.exception.MyException;

import java.util.Scanner;

/**
 * Created by Magda on 11.03.2018.
 */
public class User extends Requirement {

    public String name;
    public String nazwisko;
    public String email;


    public void setData() throws MyException {

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("Podaj name, nazwisko i adres e-mail: ");

        boolean correct = false;
        name = scanner.nextLine();
        nazwisko = scanner.nextLine();
        while (!correct) {
            email = scanner.nextLine();
            if (!email.contains("@")) {
                throw new MyException(email);
            } else {
                correct = true;
            }
        }

    }
}