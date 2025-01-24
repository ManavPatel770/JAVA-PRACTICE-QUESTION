import java.util.Scanner;

public class DecimalToBinary {

    public static int decimalToBinary(int dec) {

        int bin = 0;
        int power = 0;

        while (dec > 0) {
            int remainder = dec % 2;
            bin = bin + (int) (remainder * Math.pow(10, power));

            power++;
            dec = dec / 2;

        }
        return bin;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Decimal Number:");
        int dec = sc.nextInt();

        System.out.println("Decimal number " + dec + " in Binary " + decimalToBinary(dec));
    }
}
