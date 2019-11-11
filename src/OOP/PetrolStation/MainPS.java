package OOP.PetrolStation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPS extends PetrolStation {

    public static void main(String[] args) {

        PetrolStation station = new PetrolStation();

        station.setPrice(1.3);
        Scanner scanner = new Scanner(System.in);

        boolean goOn = true;

        System.out.println("Enter continue or finish: ");

        while (goOn) {
            try {
                String word = scanner.nextLine();

                if (word.equals("continue")) {
                    System.out.println("Enter amount: ");


                    double i = scanner.nextDouble();
                    System.out.println("Amount: " + i);
                    double total = station.getPrice() * i;
                    System.out.println(total);
                    System.out.println("done");


                } else if (word.equals("finish")) {
                    System.out.println("Pay: ");

               /* if (scanner.nextDouble() == 10) {
                    System.out.println("Done");
                }*/
                    break;
                } else {
                    System.out.println("Please use continue or finish");
                }
            } catch (InputMismatchException e) {

            }
        }
    }
}
