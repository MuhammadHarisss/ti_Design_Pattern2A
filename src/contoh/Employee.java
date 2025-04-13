package contoh;

public class Employee {
    private String nama;
    private double gaji;
    private double bonus;

    public Employee(String nama, int gaji, double bonus) {
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }

    public String getNama() {
        return this.nama;
    }

    public void kerja() {
        System.out.println("Sebagai Karyawan");
    }

    public double getGajiTotal() {
        return (this.gaji * this.bonus) + this.gaji;
    }
}
