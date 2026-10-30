import java.util.Scanner;

class Rekening {
    private String nomor;
    private String pemilik;
    private int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public String getNomor() {
        return this.nomor;
    }

    public String getPemilik() {
        return this.pemilik;
    }

    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        this.saldo += jumlah;
        return true;
    }

    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > this.saldo) {
            return false;
        }
        this.saldo -= jumlah;
        return true;
    }

    private String formatRupiah(int jumlah) {
        return String.format("Rp%,d", jumlah).replace(',', '.');
    }

    public void cetakInfo() {
        System.out.println(this.nomor + " | " + this.pemilik + " | " + formatRupiah(this.saldo));
    }
}
