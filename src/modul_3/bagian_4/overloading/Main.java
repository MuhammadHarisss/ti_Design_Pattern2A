package modul_3.bagian_4.overloading;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        // Memanggil method tambah dengan berbagai variasi parameter
        System.out.println("Tambah (2 + 3) = " + kalkulator.tambah(2, 3));
        System.out.println("Tambah (2 + 3 + 4) = " + kalkulator.tambah(2, 3, 4));
        System.out.println("Tambah (2.5 + 3.5) = " + kalkulator.tambah(2.5, 3.5));
    }
}