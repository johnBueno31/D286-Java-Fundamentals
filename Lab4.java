import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String name = scnr.nextLine();
        int age = scnr.nextInt();
        String salary = scnr.next();

        System.out.println(name + " is " + age + " and makes $" + salary + ".");
    }
}
