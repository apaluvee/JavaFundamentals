import java.sql.SQLOutput;
import java.util.Scanner;

public class GameOfStones {

    public static void main(String[] args) {

        game();
    }

    public static void game() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stones:");
        int i = scanner.nextInt();
        System.out.println(i);


        for (int g = 0; i > 0; g++) {

            System.out.println("Remove 2, 3 or 5 stones");
            int j = scanner.nextInt();

            int x = i - j;  //poolik..........

            if (j == 2) {

                System.out.println("Stones left: " + (x) + "\nNext turn:");

            } else if (j == 3) {

                System.out.println("Stones left: " + (x) + "\nNext turn:");

            } else if (j == 5) {

                System.out.println("Stones left: " + (x) + "\nNext turn:");

            } else {
                System.out.println("Invalid move! You lose!");
                break;
            }

        }
    }
}