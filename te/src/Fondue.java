import java.util.Scanner;
public class Fondue {

    private static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args) {
        final int BASE = 4; // количество персон
// Для приготовления фондю на 4 человека :
        double fromage = 800; // 800гр сыра
        double eau = 2; // 200мл воды (2dl)
        double ail = 2; // 2 зубчика чеснока
        double pain = 400; // 400 гр хлеба
        System.out.print("Введите число людей приглашенных на фондю : ");
        int nbConvives = clavier.nextInt();
        double ratio = nbConvives;
        ratio /= BASE;
        fromage *= ratio;
        eau *= ratio;
        ail *= ratio;
        pain *= ratio;
        System.out.println();
        System.out.print("Для приготовления фондю " + nbConvives + " personne(s), ");
        System.out.println("Нужно : ");
        System.out.println(" - " + fromage + " гр сыра");
        System.out.println(" - " + eau + " л воды");
        System.out.println(" - " + ail + " зубчика чеснока");
        System.out.println(" - " + pain + " гр хлеба");
        System.out.println(" – Перец по вкусу");
    }

}