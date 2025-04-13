package modul_3.Latihan.Latihan_4.Overloading;

public class Main {
    public static void main(String[] args) {
        Matematika m = new Matematika();

        System.out.println("Tambah 2 int: " + m.tambah(5, 10));
        System.out.println("Tambah 3 int: " + m.tambah(3, 4, 5));
        System.out.println("Tambah 2 double: " + m.tambah(2.5, 3.8));
    }
}
