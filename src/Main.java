import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  System.out.println("Input five-digit number and click Enter");
        int number = sc.nextInt();
        int number1 = number % 100000 / 10000;
        int number2 = number % 10000 / 1000;
        int number3 = number % 1000 / 100;
        int number4 = number % 100 / 10;
        int number5 = number % 10;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
    }
}
