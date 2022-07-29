import java.util.Scanner;
class AgeBis {
    public static void main(String[] args) {
        final int Age_Now = 2017;
        Scanner input = new Scanner(System.in);
        System.out.println("Write age : ");
        int age = input.nextInt();
        int ageN = Age_Now - age;
        System.out.println("Your year of birth is: " + ageN);
        System.out.println("Your year of birth is: " + ageN);
    }
}