package modul_3.bagian_3.pewarisan;

class Mobil extends Kendaraan {
    int JumlahPintu;

    void displayInfoMobil() {
        displayInfo(); // Memanggil metode dari superclass
        System.out.println("Jumlah Pintu: " + JumlahPintu);
    }
}