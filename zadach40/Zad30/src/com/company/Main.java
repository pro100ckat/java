package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random Rnd = new Random();
        int[] FirstMults;
        int[] SecondMults;
        FirstMults = new int[16];
        SecondMults = new int[16];
        FirstMults[1] = 2 + Rnd.nextInt(8);
        SecondMults[1] = 2 + Rnd.nextInt(8);
        System.out.println(FirstMults[1] + "*" + SecondMults[1] + " " + 1);
        for (int i = 2; i < 16; i++) {
            int fm = 0;
            int sm = 0;
            Boolean NewMult;
            do {
                NewMult = true;
                fm = 2 + Rnd.nextInt(8);
                sm = 2 + Rnd.nextInt(8);
                for (int j = 1; j < i; j++) {
                    if (((FirstMults[j] == fm) && (SecondMults[j] == sm)) || ((FirstMults[j] == sm) && (SecondMults[j] == fm))) {
                        NewMult = false;
                    }
                }
            } while (NewMult == false);
            FirstMults[i] = fm;
            SecondMults[i] = sm;
            System.out.println(FirstMults[i] + "*" + SecondMults[i] + " " + i);
        }

    }
}
