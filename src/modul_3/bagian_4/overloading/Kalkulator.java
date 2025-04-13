package modul_3.bagian_4.overloading;

class Kalkulator {
    // Overloading metode tambah dengan dua parameter int
    public int tambah(int a, int b) {
        return a + b;
    }

    // Overloading metode tambah dengan tiga parameter int
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading metode tambah dengan dua parameter double
    public double tambah(double a, double b) {
        return a + b;
    }
}

