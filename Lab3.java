import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int tableSize = 10, guests, tablesFilled;

        guests = scnr.nextInt();

        tablesFilled = guests / tableSize;

        System.out.println("Tables filled: " + tablesFilled);
    }
}
