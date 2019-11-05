import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        //biggestValueFromArray();
        //findLongestCharS();
        //triangle1();
        triangle2();

    }

    /**
     * 9. ### Write an application that will find biggest value within array of int variables.
     * a. ### check your application using randomly generated array (use Random class),
     * b. ### check your application at least 5 times in a loop (generate random array ->
     * print array to the console -> find biggest value -> print biggest value -> manually verify results).
     */

    public static void biggestValueFromArray() {

        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        int min = 1;
        int max = 50;
        int[] myArray = new int[10];

        try {
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < myArray.length; i++) {
                    myArray[i] = rand.nextInt((max - min) + 1) + min;
                }
                System.out.println(Arrays.toString(myArray));
                Arrays.sort(myArray);
                int biggest = myArray[myArray.length - 1];
                System.out.println("Biggest value: " + biggest + "\nEnter biggest value: ");

                int check = scan.nextInt();
                if (check == biggest) {
                    System.out.println("Check!");
                } else {
                    System.out.println("Wrong number!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entered value is not a number!");
        }
    }

    /**
     * 10. Write an application that will find the longest char sequence within an array of type String.
     * Test it in the same way as you have done in the previous exercise.
     * ### How will you generate random char sequences?
     */

    public static void findLongestCharS() {

        String[] myArray = new String[20];
        Random rand = new Random();

        //char c = (char)(r.nextInt()); //kõik unicode charid
        //char c = (char)(r.nextInt(26) + 'a'); //tähed a-z

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = String.valueOf((char) (rand.nextInt(26) + 'a'));
        }
        System.out.println(Arrays.toString(myArray));

    }

    public static void triangle1() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangle2() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String vastus= "";
        int i = 1;
        int j = 2;
        vastus += i;
        vastus += j;

        for ( j = 1; j <= input; j++) {
            System.out.print(String.valueOf(j));
        }
    }


}
/**
 * a. triangle,
 * b. *rectangle with diagonals,
 * c. **Christmas tree

 * 1
 * 12
 * 123
 * 1234
 * 12345
 */