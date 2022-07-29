package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,1,1,2,3,4,5,8,9,0,10,11};
        int b[] = {1,2,2,2,3,4,6,7,7,7,10};
        int temp = a[0] - 100;// чтобы не равнялся первому элементу первого массива
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < b.length; j++){
                if ((b[j] == a[i])&&(b[j]!=temp)){
                    System.out.println(b[j] + " ");
                    temp = b[j];
                    break;
                }
            }
    }
}
