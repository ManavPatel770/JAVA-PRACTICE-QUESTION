import java.util.Scanner;;
public class BinaryToDecimal {

    public static int binaryToDecimal(int bin) {

        int dec = 0;
        int power = 0;

        while (bin > 0) {

            int ld = bin % 10;

            dec = dec + (int)(ld * Math.pow(2, power));
            power++;
            bin = bin / 10;
        }
        return dec;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number:");
        int bin = sc.nextInt();

        System.out.println("binary number " + bin + " in decimal " + binaryToDecimal(bin));

    }
}
