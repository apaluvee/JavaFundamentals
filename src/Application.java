import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //hello();
        //doublei();
        //threeStrings();
        //ints();
        //sum();
        //threeVariables();
        //greaterLower();
        //twoNumbers();
        //numberName();
        //nestedForLoop();
        //milkWine();
        //divideBy();
        //printBack();
        //printSum();
        testSumFromOneToN();
    }

    public static void hello() {
        System.out.print("Hello world\nHello world\n");
    }

    public static void doublei() {
        double i = 10.26234;
        System.out.printf("%.2f", i);
    }

    public static void threeStrings() {

        System.out.println(String.format("\n%-15s %-15s %-15s", "test", "two", "three"));

    }

    public static void ints() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double c = (double) a / b;

        System.out.printf("%.3f", c);

    }

    public static void sum() {
        int int1 = Integer.MAX_VALUE;
        int int2 = Integer.MAX_VALUE;
        System.out.println((long) int1 + int2);
    }

    public static void threeVariables() {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        byte b = scanner.nextByte();
        char c = scanner.next().charAt(0);  //0 = first char

        System.out.println(f);
        System.out.println(b);
        System.out.println(c);
    }

    public static void greaterLower() {
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (number > 30) {
                System.out.println(number + " is greater than 30");
            } else if (number == 30) {
                System.out.println(number + " is equal to 30");
            } else if (number < 30) {
                System.out.println(number + " is less than 30");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter a number");
        }

    }

    /*As above but compare two values at the same time. Verify if first value is greater than 30
    and second value is greater than 30, and so on.*/

    public static void twoNumbers() {
        try {
            long start = System.nanoTime();

            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();


            if (number1 > 30 || number2 > 30) {
                System.out.println("One value is greater than 30");
            } else if (number1 == 30 || number2 == 30) {
                System.out.println("One is equal to 30");
            } else if (number1 < 30 || number2 < 30) {
                System.out.println("One is less than 30");
            }


            System.out.println(System.nanoTime() - start);


        } catch (InputMismatchException e) {
            System.out.println("Enter a number");
        }


    }

    public static void numberName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 9");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        }

    }

    public static void arrays() {
        int[] intArrays = {1, 2, 3, 4, 5, 6};

        for (int number : intArrays) {
            System.out.println(number);
        }
    }


    public static void nestedForLoop() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = scanner.nextInt();

        for (int i = 0; i < numbers; i++) {
            sum = sum + (scanner.nextInt());

        }
        System.out.println(sum);

    }

    public static void milkWine() {
        System.out.println("Enter: milk or wine");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        try {
            while (true) {
                if (word.equalsIgnoreCase("milk")) {
                    System.out.println("Price: 5$");
                    int i = scanner.nextInt();
                    if (i == 5) {
                        System.out.println("Thanks!");
                        break;
                    } else if (i < 5) {
                        System.out.println("Not enough money");
                    } else System.out.println("Too much money");
                    break;
                } else if (word.equalsIgnoreCase("wine")) {
                    System.out.println("What's your age?");
                    if (scanner.nextInt() < 18) {
                        System.out.println("Too young to buy wine!");
                    } else {
                        System.out.println("Price: 10$");
                        int i = scanner.nextInt();
                        if (i == 10) {
                            System.out.println("Thanks!");
                        } else if (i < 5) {
                            System.out.println("Not enough money");
                        } else System.out.println("Too much money");
                    }
                    break;
                } else {
                    System.out.println("Out of stock!");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("This is not a number!");
        }
    }

    public static void divideBy() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number:");
            double value1 = sc.nextDouble();
            if (value1 == 0) {
                break;
            }
            System.out.println("Enter second number:");
            double value2 = sc.nextDouble();
            if (value1 == 0 || value2 == 0) {
                break;
            } else {
                double division = value1 / value2;
                System.out.printf("%.4f", division);
                System.out.println();
            }
        }
    }

    public static void printBack() {
        String name = "name";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
    }

    /**
     * Testing part
     */

    public static int printSum() {
        //Scanner scanner = new Scanner(System.in);
        //int number = scanner.nextInt();
        int sum = 0;
        int number = -3;
        if (number < 1) {
            for (int i = 1; i >= number; i--) {
                sum = sum+i;
            }
        } else {
            for (int i = 1; i <= number; i++) {
                sum = sum + i;
            }
        }

        return sum;
    }
    public static void testSumFromOneToN() {
        int expectedResult = -5; // n = 1+2+3+4+5
        int actualResult = printSum();

        if (expectedResult != actualResult) {
            throw new ArithmeticException();
        }
    }


}
