import java.util.Scanner;

// public class lab8 {
//     public static void main(String[] args) {
//         Scanner scnr = new Scanner(System.in);

//         // create a double array names values that takes in 3 items
//         double[] values = new double[3];

//         // create a for loop that iterates through the scanner 3 times
//         for (int i = 0; i < 3; i++) {
//             values[i] = scnr.nextDouble();
//         }

//         // initialize sum variable
//         double sum = 0.0;

//         // create a for each in order to iterate through the list and find the sum
//         for (double value : values) {
//             sum += value;
//         }

//         // initialize average variable
//         double average = sum / 3;

//         // print array items output
//         System.out.print("Array items: ");

//         // create a for loop that will print the values and a nested if statement to add
//         // a comma in between
//         for (int i = 0; i < 3; i++) {
//             System.out.print(values[i]);
//             if (i < 2) {
//                 System.out.print(", ");
//             }
//         }

//         // print a line and then print the average
//         System.out.println();
//         System.out.println("Average: " + average);

//     }
// }

public class lab8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double[] values = new double[3];

        for (int i = 0; i < 3; i++) {
            values[i] = scnr.nextDouble();
        }

        double sum = 0.0;

        for (double value : values) {
            sum += value;
        }

        double average = sum / 3;

        System.out.print("Array items: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(values[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Average: " + average);

    }
}
