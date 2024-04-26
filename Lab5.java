import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();

        String concatNum = Integer.toString(num1) + Integer.toString(num2) + Integer.toString(num3);

        int sum = num1 + num2 + num3;

        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid input!");
        } else

        if (sum % 3 == 0) {
            System.out.println(concatNum + " is divisible by 3!");
        } else {
            System.out.println(concatNum + " is not divisble by 3!");
        }

    }
}
