import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
// if(sc.hasNextInt()) {
        n = sc.nextInt();
// } else {
// System.out.println("Вы ввели не целое число");
// }
        int[] mas;
        mas = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Введите " + (i + 1) + " элемент: ");
            mas[i] = sc.nextInt();
        }
        Main.getSumNumbers(mas);//что делать с n?
    }

    public static int getSumNumbers(int[] numbers){
        int max = numbers[0], min = numbers[0], comp = 1, sum = 0, dif = 0;//что делать с разностью?
        double avr = 0;
        for(int i = 0; i< numbers.length ; i++){
            sum += numbers[i];
            comp *= numbers[i];

            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];

        }
        avr = sum / numbers.length;
        System.out.println("Max: " + max);
        System.out.println("Min; " + min);
        System.out.println("Avr: " + avr);
        System.out.println("Comp: "+ comp);
// System.out.println();
        return 0;
    }
}