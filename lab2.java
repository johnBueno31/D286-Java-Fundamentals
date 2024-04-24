import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int starting_num = scnr.nextInt();
        int multiplier = scnr.nextInt();

        int result = starting_num * multiplier;

        System.out.print(result);

        for (int i = 0; i < 2; i++) {
            result = result * multiplier;
            System.out.print(" " + result);
        }

        System.out.println();
    }
}
