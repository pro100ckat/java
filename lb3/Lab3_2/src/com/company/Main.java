package com.company;

public class Main{
    public static void main(String[] args){
        int [][] arr = new int[5][6];
        int i,j;
        int max;
        int k,m;
        for( i =0; i<arr.length; i++){

            for( j=0; j<arr[i].length; j++){
                arr[i][j]=(int)(Math.random()*10);

                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

        for(i = 0; i < arr.length; i++)
        {
            max = arr[i][0];
             m = 0;
            for(j = 0; j < arr.length; j++)
            {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    m=j;
                }

            }
            k=arr[i][0];
            arr[i][0] = max;
            arr[i][m] = k;

        }




        System.out.println("Преобразованный массив: ");
        for( i =0;i<arr.length;i++){

            for( j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}