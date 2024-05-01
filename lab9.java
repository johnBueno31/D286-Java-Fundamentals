import java.util.Scanner;
import java.util.Random;

// public class lab9 {
//     // Define method here
//     public static boolean showResults(Random rand) {
//         // inside the method, initialize a randomNumber variable that will generate
//         // either 0 or 1
//         int randomNumber = rand.nextInt(2);
//         // then return randomNumber if it equals 1
//         return randomNumber == 1;
//     }

//     public static void main(String[] args) {
//         Scanner scnr = new Scanner(System.in);
//         Random rand = new Random(2);

//         // initialize variable n for input integer
//         int n = scnr.nextInt();

//         // create a loop that will iterate n times to print the boolean results
//         for (int i = 0; i < n; i++) {
//             boolean results = showResults(rand);
//             System.out.println(results);
//         }
//     }
// }

// public class lab9 {

//     public static boolean showResults(Random rand) {
//         int randomNumber = rand.nextInt(2);
//         return randomNumber == 1;
//     }

//     public static void main(String[] args) {
//         Scanner scnr = new Scanner(System.in);
//         Random rand = new Random(2);

//         int n = scnr.nextInt();

//         for (int i = 0; i < n; i++) {
//             boolean result = showResults(rand);
//             System.out.println(result);
//         }
//     }
// }

// public class lab9 {

//     public static boolean showResults(Random rand) {
//         int randomNumber = rand.nextInt(2);
//         return randomNumber == 1;
//     }

//     public static void main(String[] args) {
//         Scanner scnr = new Scanner(System.in);
//         Random rand = new Random(2);

//         int n = scnr.nextInt();

//         for (int i = 0; i < n; i++) {
//             boolean result = showResults(rand);
//             System.out.println(result);
//         }
//     }
// }

public class lab9 {

    public static boolean showResults(Random rand) {
        int randomNumber = rand.nextInt(2);
        return randomNumber == 1;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Random rand = new Random(2);

        int n = scnr.nextInt();

        for (int i = 0; i < n; i++) {
            boolean result = showResults(rand);
            System.out.println(result);
        }

    }
}