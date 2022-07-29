package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        int[] p = {2,5,1,4,7,3,6};
        int n=p.length;
        int[] op = new int[n];


//Task5()

        {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (p[j] == i + 1) {
                        op[i] = j + 1;
                    }
                }
            }

            for (int i=0;i<n;i++){
                System.out.print(op[i]+ " ");
            }
            System.out.print(" - обратная перестановка");

            int sum = 0;
            int iter = 0;

            ArrayList<Integer> buff = new ArrayList<Integer>();

            for (int el:p){
                buff.add(el);
            }
            for(int i=1;i<=n;i++){
                iter = 0;
                for (int j=0;j<buff.size();j++){
                    if (buff.get(j) != i ){
                        iter += 1;
                    } else{
                        sum = sum + iter;
                        buff.remove(j);
                        break;
                    }
                }

            }
            System.out.println();

            if (sum%2==0){
                System.out.println("Перестановка четная - "+sum);
            }
            else System.out.println("Перестановка не четная - "+sum);
        }
    }
}
