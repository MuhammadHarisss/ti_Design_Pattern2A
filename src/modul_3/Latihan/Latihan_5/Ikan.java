package modul_3.Latihan.Latihan_5;

public class Ikan extends HewanAir implements Berenang {

    public Ikan(String nama) {
        super(nama);
    }

    @Override
    public void berenang() {
        System.out.println(nama + " berenang dengan cepat di laut.");
    }

    @Override
    public void makan() {
        System.out.println(nama + " memakan plankton dan serangga kecil.");
    }
}
