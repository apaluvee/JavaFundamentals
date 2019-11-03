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
        milkWine();
        //divideBy();
        //printBack();
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
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        while(true){
            if (word.equals("milk")) {
                System.out.println("Price: 50");
                if (scanner.nextInt() == 50) {
                }
                System.out.println("done");
                break;
            } else word.equals("wine"); {
                System.out.println("Enter age: ");
                if (scanner.nextInt() >= 18) {
                    System.out.println("Price: 10");
                    if (scanner.nextInt() == 10) {
                        System.out.println("Done");
                    } else System.out.println("Cant buy because of money");
                } else {
                    System.out.println("Too young to buy wine!");
                }
                break;
            }
        }
    }

    public static void divideBy() {

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Enter first number:");
            double value1 = sc.nextDouble();
            System.out.println("Enter second number:");
            double value2 = sc.nextDouble();
            if (value1 != 0 || value2 != 0) {
                double division = value1 / value2;
                System.out.printf("%.4f", division);

            } else {
                break;
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


}
