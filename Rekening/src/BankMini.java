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

            if (pilihan == 1) {
                System.out.print("Masukkan jumlah setor: ");
                int jumlahSetor = scanner.nextInt();
                if (rekening.setor(jumlahSetor)) {
                    System.out.println("Setor berhasil.");
                } else {
                    System.out.println("Setor ditolak!");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah tarik: ");
                int jumlahTarik = scanner.nextInt();
                if (rekening.tarik(jumlahTarik)) {
                    System.out.println("Penarikan berhasil.");
                } else {
                    System.out.println("Penarikan ditolak!");
                }
            } else if (pilihan == 3) {
                rekening.cetakInfo();
            } else if (pilihan == 0) {
                System.out.println("Keluar dari sistem.");
            } else {
                System.out.println("Menu tidak dikenal.");
            }
        }

        System.out.println("\n~~~~~~~~~~ SALDO AKHIR ~~~~~~~~~~");
        rekening.cetakInfo();

        scanner.close();
    }

}