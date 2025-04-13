package modul_3.latihan.latihan_3;

public class Laptop {
    private String merk;
    private Processor processor;
    private RAM ram;

    public Laptop(String merk, Processor processor, RAM ram) {
        this.merk = merk;
        this.processor = processor;
        this.ram = ram;
    }

    public void hidupkan() {
        System.out.println("Menyalakan laptop " + merk + "...");
        processor.jalankan();
        ram.baca();
        ram.tulis();
        System.out.println("Laptop siap digunakan.\n");
    }
}