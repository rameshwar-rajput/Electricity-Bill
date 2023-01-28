import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        double i, o;
        double bill = 0;
        while (true) {
            System.out.println("enter unit ");

            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            o = i;
            if (i > 0) {
                if (i > 199) {
                    o = o - 199;
                    bill += 199 * 1.2;
                } else {
                    bill += o * 1.2;
                }
            }
            if (i > 200) {
                if (i > 400) {
                    o = o - 200;
                    bill += 200 * 1.5;
                } else {
                    bill += o * 1.5;
                }
            }
            if (i > 400) {
                if (i > 600) {
                    o = o - 200;
                    bill += 200 * 1.8;
                } else {
                    bill += o * 1.8;
                }
            }
            if (i > 600) {
                bill += o * 2.00;
            }
            System.out.println("bill  =" + bill);
            if (bill > 400) {
                bill = bill + ((bill - 400) * 0.15);
            }
            System.out.println("bill 15% surcharge = " + bill);
            System.out.println("exit 1");
            i = scanner.nextInt();
            if (i == 1) {
                break;
            }
            bill = 0;
        }
    }
}