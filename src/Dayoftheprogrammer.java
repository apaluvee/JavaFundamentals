import java.util.Scanner;

public class Dayoftheprogrammer {

    public static void main(String[] args) {

        dayOfTheProgrammer();
    }

    public static void dayOfTheProgrammer() {

        int pDay = 256;
        int leap = 244;
        int notLeap = 243;
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year >= 1700 && year <= 1917) {
            if (year % 4 == 0) {
                System.out.println(pDay - leap + ".09." + year);
            } else {
                System.out.println(pDay - notLeap + ".09." + year);
            }
        } else if (year >= 1919) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(pDay - leap + ".09." + year);
            } else {
                System.out.println(pDay - notLeap + ".09." + year);
            }
        } else {
            int year1918 = notLeap - 13;
            System.out.println(pDay - year1918 +".09." + year);
        }
    }
}


//answer = leapYear ? leap + year : notLeap + year;
