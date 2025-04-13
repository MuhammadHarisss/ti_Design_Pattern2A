package modul_3.latihan.latihan_3;

public class RAM {
    private int kapasitasGB;

    public RAM(int kapasitasGB) {
        this.kapasitasGB = kapasitasGB;
    }

    public void baca() {
        System.out.println("RAM " + kapasitasGB + "GB sedang membaca data...");
    }

    public void tulis() {
        System.out.println("RAM " + kapasitasGB + "GB sedang menulis data...");
    }
}
