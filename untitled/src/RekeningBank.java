// Kelas RekeningBank
class RekeningBank {
    // Atribut
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Konstruktor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println("----------------------------");
    }

    // Method untuk setor uang
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah);
        System.out.println("Saldo setelah setor: Rp" + saldo);
        System.out.println("----------------------------");
    }

    // Method untuk tarik uang
    public void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk penarikan!");
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah);
            System.out.println("Saldo setelah tarik: Rp" + saldo);
        }
        System.out.println("----------------------------");
    }
}

// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek RekeningBank
        RekeningBank rekening1 = new RekeningBank("12345678", "NamaKamu", 500000);
        RekeningBank rekening2 = new RekeningBank("87654321", "NamaTeman", 300000);

        // Menampilkan informasi rekening awal
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi
        rekening1.setorUang(150000);
        rekening2.tarikUang(50000);

        // Menampilkan informasi rekening setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
