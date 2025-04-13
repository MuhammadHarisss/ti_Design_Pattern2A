package modul_3.Latihan.Latihan_4.Overriding;

public class Main {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(4);
        BangunDatar lingkaran = new Lingkaran(7);

        System.out.println("Luas persegi: " + persegi.hitungLuas());
        System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
    }
}