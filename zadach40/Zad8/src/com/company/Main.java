package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numberst = input.next();
        int number = Integer.parseInt(numberst);
        String RusEng;
        switch (number) {
            case 1:
                RusEng = "Один/One";
                break;
            case 2:
                RusEng = "Два/Two";
                break;
            case 3:
                RusEng = "Три/Three";
                break;
            case 4:
                RusEng = "Четыре/Four";
                break;
            case 5:
                RusEng = "Пять/Five";
                break;
            case 6:
                RusEng = "Шесть/Six";
                break;
            case 7:
                RusEng = "Семь/Seven";
                break;
            case 8:
                RusEng = "Восемь/Eight";
                break;
            case 9:
                RusEng = "Девять/Nine";
                break;
            case 10:
                RusEng = "Десять/Ten";
                break;
            case 11:
                RusEng = "Одиннадцать/Eleven";
                break;
            case 12:
                RusEng = "Двенадцать/Twelwe";
                break;
            case 13:
                RusEng = "Тринадцать/Thirteen";
                break;
            case 14:
                RusEng = "Четырнадцать/Fourteen";
                break;
            case 15:
                RusEng = "Пятнадцать/Fifteen";
                break;
            case 16:
                RusEng = "Шестнадцать/Sixteen";
                break;
            case 17:
                RusEng = "Семнацать/Seventeen";
                break;
            case 18:
                RusEng = "Восемнадцать/Eighteen";
                break;
            case 19:
                RusEng = "Девятнадцать/Nineteen";
                break;
            case 20:
                RusEng = "Двадцать/Twenty";
                break;
            default:
                RusEng = "Invalid input";
                break;
        }
        System.out.println(RusEng);
    }
}
