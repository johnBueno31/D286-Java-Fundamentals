import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int sum = 0;

        while (true) {
            int num = scnr.nextInt();

            if (num < 0) {
                break;
            }

            sum += num;

            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Sum: " + sum);

    }
}
