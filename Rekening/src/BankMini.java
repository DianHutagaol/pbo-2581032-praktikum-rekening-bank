import java.util.Scanner;


public class BankMini {
    public static void main(String[] args) {
//Pesan error dari compiler(javac): saldo has private access in Rekening
        Rekening rekening = new Rekening("001", "Ani", 100000);


        Scanner scanner = new Scanner(System.in);
        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("\n~~~~~~~ MENU BANK MINI ~~~~~~~");
            System.out.println("1. Setor");
            System.out.println("2. Tarik");
            System.out.println("3. Info");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("Menu tidak dikenal.");
                continue;
            }


        }

        System.out.println("\n~~~~~~~~~~ SALDO AKHIR ~~~~~~~~~~");
        rekening.cetakInfo();

        scanner.close();
    }

}