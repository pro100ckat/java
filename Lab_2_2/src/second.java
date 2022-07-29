import java.lang.Math;
import java.util.Scanner;

public class second {
    private static int  a, b,n;
    private static double f,g;

    public second() {

        double ch;
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.println("Введите a,b");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    public static double pl() {
        return + (double) (Math.multiplyExact(a, b)/2);

    }
    public static double per() {
        return +  (Math.hypot(a, b) + a + b);

    }
    public static double cifri() {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.println("Введите n");
        n = sc.nextInt();
        return + Math.ceil(Math.log10(n));

    }
    public static double psevdo() {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        a=3;
        b=10;
        int s=(int)(Math.random()*(b-a)+1)+a;
        return + s;

    }


}
