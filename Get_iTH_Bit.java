import java.util.Scanner;

// example =  entre number 4 = convert binary 100 and 0->0 ith bit , 0->1 ith bit ,  1->2 ith bit;

public class Get_iTH_Bit {
    public static int getIthBit(int n, int i) {

        int bitMask = 1 << i;

        if (((n & bitMask) == 0)) {
            return 0;

        } else {
            return 1;
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        System.out.println("Enter i th bit you want to find:");
        int i = sc.nextInt();

        System.out.println("i th bit is = " + getIthBit(n, i));

    }
}
