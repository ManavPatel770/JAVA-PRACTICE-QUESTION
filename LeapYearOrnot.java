

// WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthat
// year is a leap year or not.
import java.util.Scanner;

public class LeapYearOrnot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("year is leap year:");

        } else {
            System.out.println("year is not a leap year:");

        }

    }

}


