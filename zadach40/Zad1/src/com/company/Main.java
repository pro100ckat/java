package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s1 = scr.nextLine();
        String s2 = scr.nextLine();
        String s3 = scr.nextLine();
        String s4 = scr.nextLine();
        String s5 = scr.nextLine();

        if(s4.equals(s5))
        {
            s1 += s2;
            System.out.println(s1);
        }
        else
        {
            s1 += s3;
            System.out.println(s1);
        }


    }
    }

