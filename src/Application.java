import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // hello();
        // doublei();
        // threeStrings();
        //ints();
        //sum();
        //threeVariables();
        greaterLower();
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
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 30) {
            System.out.println(number + " is greater than 30");
        } else if (number == 30) {
            System.out.println(number + " is equal to 30");
        } else if (number < 30) {
            System.out.println(number + " is less than 30");
        }

    }


}
