package P1;

import java.util.Scanner;

public class Percobaan2_22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc22.nextLine();
        int n = nim.charAt(nim.length() - 1) - '0';

        if (n < 10) {
            n += 10;
        }
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10)
                continue;
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
