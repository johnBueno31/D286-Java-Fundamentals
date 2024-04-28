import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;

        String name = scnr.nextLine();

        int firstSpace = name.indexOf(" ");
        firstName = name.substring(0, firstSpace);

        int secondSpace = name.indexOf(" ", firstSpace + 1);

        if (secondSpace < 0) {
            lastName = name.substring(firstSpace + 1);

            System.out.println(lastName.charAt(0) + "., " + firstName);
        } else {
            middleName = name.substring(firstSpace + 1, secondSpace);
            lastName = name.substring(secondSpace + 1);
            System.out.println(lastName.charAt(0) + "., " + firstName + " " + middleName.charAt(0) + ".");
        }
    }
}
