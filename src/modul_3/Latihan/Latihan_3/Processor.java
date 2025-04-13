package modul_3.latihan.latihan_3;

public class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public void jalankan() {
        System.out.println("Processor " + model + " sedang dijalankan...");
    }
}