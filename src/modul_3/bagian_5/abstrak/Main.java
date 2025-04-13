package modul_3.bagian_5.abstrak;

public class Main {
    public static void main(String[] args) {
        Hewan Kucing = new Kucing();
        Kucing.nama = "Kitty";
        Kucing.makan(); // Method konkret dari abstract class
        Kucing.bersuara(); // Method abstrak yang di override

        Hewan anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.makan(); // Method konkret dari abstract class
        anjing.bersuara(); // Method abstrak yang dioverride
    }
}
