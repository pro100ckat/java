package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random Rnd = new Random();
        int[] arr;
        arr = new int[10];
        int localmax = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = Rnd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i < 9; i++) {
            if ((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1])) {
                localmax++;
            }
        }
        System.out.println("");
        System.out.print(localmax);
    }
}
