package ArmstrongInGivenRange;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int low = in.nextInt();
        int high = in.nextInt();
        System.out.println("Armstrong numbers between " + low + " and " + high + " are : ");

        // loop for finding and printing all armstrong numbers between given range
        for (int num = low; num <= high; num++) {
            int len = getOrder(num);

            if (num == getArmstrongSum(num, len))
                System.out.print(num + " ");
        }
    }

    static int getOrder(int x) {
        int len = 0;
        while (x != 0) {
            len++;
            x /= 10;
        }
        return len;
    }

    static int getArmstrongSum(int num, int len) {
        int digit;
        if (num == 0) {
            return 0;
        }
        digit = num % 10;
        return (int) Math.pow(digit, len) + getArmstrongSum(num / 10, len);
    }
}