import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        System.out.println("Hello world!!!");
        second r = new second ();
        System.out.println("Площадь = " +r.pl());
        System.out.println("Периметр = " +r.per());
        System.out.println("Столько цифр = " +r.cifri());
        System.out.println("Псевдочисло От 3 и 10 = " + r.psevdo());
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.println("Введите a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b)
        { x = a; a = b; b = x; }
        if(b > c)
        { x = c; c = b; b = x; }

        if(a > b)
        { x = a;  a = b;  b = x; }
        System.out.println("Числа: " + a + " " + b + " " + c);


        }
    }

