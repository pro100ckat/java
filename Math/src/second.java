import java.util.Scanner;

public class second {
    private static int a, b, s;

    public second() {

        double ch;
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.println("Введите a,b");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public static int sum() {
        s = a + b;
        return +(s);

    }

    public static int raz() {
        s = a - b;
        return +(s);

    }

    public static int proiz() {
        s = a * b;
        return +(s);

    }

    public static double delen() {
        if (b != 0) {
            s = a / b;
        } else {
            System.out.println("error");
            s = 0;
        }
        return +s;
    }

    public static int proc() {
       return +a%b;
    }
    public static int and() {
        return +a&b;
    }
    public static int or() {
        return +a|b;
    }
    public static int iskl() {
        return +a^b;
    }
    public static int max() {
        if (a>b)
        {
            s=a;
        }
        else
        {
            s=b;
        }
        return +s;
    }
    public static int min() {
        if (a<b)
        {
            s=a;
        }
        else
        {
            s=b;
        }
        return +s;
    }
}


