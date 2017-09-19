import java.util.Scanner;

// Var har du "Sluta vid CTRL+D" Förstår inte riktigt hur jag ska göra det?

public class Uppgift13 {
    public static void main(String[] args) {

        // variable setup
        int y, n, a, b, m, q, w, d;
        Scanner sc = new Scanner(System.in);

        // run until escape cmd
        while (true) {

            // ask for input and check correct usage
            do {
                System.out.print("Ange ett år mellan 1900 och 2099: ");
                y = sc.nextInt();
                if (y < 1900 || y > 2099)
                    System.out.println("Fel årtal!\n");
            } while (y < 1900 || y > 2099);

            // calculate the day
            n = y - 1900;
            a = n % 19;
            b = (7 * a + 1) / 19;
            m = (11 * a + 4 - b) % 29;
            q = n / 4;
            w = (n + q + 31 - m) % 7;
            d = 25 - m - w;

            // print date
            if (d > 0) {
                System.out.println(y + " inföll påskdagen " + d + " april\n");
            } else {
                d = 31 + d;
                System.out.println(y + " inföll påskdagen " + d + " mars\n");
            }
        }
    }
}

/*

----Min version

import javax.swing.*;

public class Uppgift13 {

    public static void main (String[] args) {

        while (true) {

            String indata = JOptionPane.showInputDialog("Please enter what your you are examining");

            int y = Integer.parseInt(indata);
            int n = y - 1900;
            int a = n % 19;
            int b = (7 * a + 1) / 19;
            int m = (11 * a + 4 - b) % 29;
            int q = n / 4;
            int w = (n + q + 31 - m) % 7;
            int d = 25 - m - w;
            String month;

            if ((1900 < y) && (y < 2099)) {
                if (d > 0) {
                    month = "April";
                } else {
                    month = "March";
                    d = 31 + d;
                }

                JOptionPane.showMessageDialog(null, "If the year is " + y + " the Easter Eve will be on the " +
                        d + " of " + month + ".");
            } else {
                JOptionPane.showMessageDialog(null, "The year isn´t avaible in this calculation");


            }
        }
    }
}
*/
