package com.company;

public class Main {

    public static void main(String[] args) {
        int RejectedIdCount=0;
        for ( int id=1; id<=99999; id++)
        {
            String idstring = Integer.toString(id);
            if ((idstring.indexOf('4')!=-1)||(idstring.indexOf("13")!=-1))
                RejectedIdCount++;
        }
        System.out.print(RejectedIdCount + " придется исключить");
    }
}
