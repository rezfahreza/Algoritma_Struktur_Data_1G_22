package JobsheetP8;
import java.util.Scanner;

public class PostfixMain22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc22.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix22 post = new Postfix22(total);
        P = post.konversi(Q);
        System.out.println("Postfix: "+P);
    }
}
