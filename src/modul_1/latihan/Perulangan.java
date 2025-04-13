package modul_1.latihan;

public class Perulangan {
    public static void main(String[] args) {
        // Menampilkan bilangan ganjil menggunakan perulangan for
        System.out.println("Bilangan ganjil menggunakan for:");

        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        // Menampilkan bilangan ganjil menggunakan perulangan while
        System.out.println("\nBilangan ganjil menggunakan while:");

        int j = 1;
        while (j <= 20) {
            System.out.print(j + " ");
            j += 2;
        }
        // Menampilkan bilangan ganjil menggunakan perulangan do while
        System.out.println("\nBilangan ganjil menggunakan do while:");

        int k = 1;
        do {
            System.out.print(k + " ");
            k += 2;
        } while (k <= 20);
    }
}