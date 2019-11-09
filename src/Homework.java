import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        //biggestValueFromArray();
        //findLongestCharS();
        //triangleStars1();
        //triangleWord();
        //triangleNumbers();
        //triangleStars2();
        //triangleEquilateral();
        //christmasTree();
        //rectDiagonal();


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
     *
     *
     * Incomplete
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


    //two for loops
    public static void triangleStars1() {
        //long start = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //System.out.println(System.nanoTime()-start);
    }


    public static void triangleWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        String enteredNumber = scanner.nextLine();
        String numbers = "";
        String entered = String.valueOf(enteredNumber);
        for (int i = 0; i < entered.length(); i++) {
            numbers = numbers + entered.charAt(i);
            System.out.println(numbers);
        }
    }

    /**
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */
    public static void triangleNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int entered = scanner.nextInt();
        String result = "";
        for (int num = 1; num <= entered; num++) {
            System.out.println(result += num);
        }
    }


    //one for loop
    public static void triangleStars2() {
        //long start = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int input = scanner.nextInt();
        String result = "";
        for (int i = 1; i <= input; i++) {
            System.out.println(result += "*");
        }
        //System.out.println(System.nanoTime()-start);
    }

    /**
     * triangle with even sides
     */
    public static void triangleEquilateral() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle size:");
        int triangle = scanner.nextInt();
        for (int i = 1; i <= triangle; i++) {
            for (int j = triangle; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * c. **Christmas tree
     */
    public static void christmasTree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle size:");
        int treeSize = scanner.nextInt();

        for (int i = 1; i <= treeSize - 2; i++) {
            for (int j = (treeSize - 2) + 2; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= treeSize - 1; i++) {
            for (int j = (treeSize - 1) + 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= treeSize; i++) {
            for (int j = treeSize; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= treeSize - (treeSize / 2); i++) {
            for (int j = 1; j <= treeSize - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= treeSize - (treeSize - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
     * b. *rectangle with diagonals,
     *
     *
     *
     * Incomplete
     */
    public static void rectDiagonal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rectangle size:");
        int entered = scanner.nextInt();

        for(int i = 0; i < entered; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j < entered -1; j++) {
            System.out.print("*");
            for (int k = 0; k < entered - 2; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int row = 0; row < entered; row ++) {
            System.out.print("*");
        }

    }

}




