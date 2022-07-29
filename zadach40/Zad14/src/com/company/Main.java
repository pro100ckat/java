package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String agestring = input.next();
        int age = Integer.parseInt(agestring);
        if (((age % 10) == 1) && ((age % 100) != 11)) {
            System.out.println(age + " Год");
        } else {
            if ((((age % 10) == 2) || ((age % 10) == 3) || ((age % 10) == 4)) && (((age % 100) / 10) != 1)) {
                System.out.println(age + " Года");
            } else {
                System.out.println(age + " Лет");
            }
        }

    }
}
