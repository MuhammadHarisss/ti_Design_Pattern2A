package modul_2.Latihan.Latihan_2;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jariJari = 10;

        double luas = lingkaran.hitungLuas();
        System.out.println("Luas lingkaran: " + luas);
    }
}
