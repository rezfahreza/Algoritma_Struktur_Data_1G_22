package P9_Praktikum1;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan kapasita queue: ");
        int n = sc22.nextInt();
        Queue q = new Queue(n);

        do {
            menu();
            pilih = sc22.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc22.nextInt();
                    q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan " + dataKeluar);
                    }
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    public static void menu() {
        System.out.println("Masukkan operassi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------------------------------------");
    }
}
