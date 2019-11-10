package OOP.PetrolStation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPS extends PetrolStation {

    public static void main(String[] args) {

        PetrolStation station = new PetrolStation();

        station.setPrice(1.3);
        Scanner scanner = new Scanner(System.in);

        boolean goOn = true;
        while (goOn) {
            try {

                System.out.println("Enter continue or finish: ");
                String word = scanner.nextLine();


                if (word.equals("continue")) {
                    System.out.println("Enter amount: ");


                    double i = scanner.nextDouble();
                    System.out.println("Amount: " + i);
                    double total = station.getPrice() * i;
                    System.out.println(total);


                } else if (word.equals("finish")) {
                    System.out.println("Pay: ");

               /* if (scanner.nextDouble() == 10) {
                    System.out.println("Done");
                }*/
                    break;
                } else {

                }
            } catch (InputMismatchException e) {

            }
        }
    }
}
