package modul_3.Latihan.Latihan_2;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setMerk("Yamaha");
        motor.setTahun(2020);

        System.out.println("Merk: " + motor.getMerk());
        System.out.println("Tahun: " + motor.getTahun());
    }
}