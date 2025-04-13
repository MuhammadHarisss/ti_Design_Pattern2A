package modul_2.Latihan.Latihan_5;

public class Barang {
    String namaBarang;
    double harga;

    public Barang() {
        this.namaBarang = "Tidak diketahui";
        this.harga = 0;
    }

    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: Rp" + harga);
    }
}
