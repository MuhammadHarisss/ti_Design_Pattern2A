package modul_3.latihan.latihan_3;

public class Main {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i7");
        RAM r = new RAM(16);
        Laptop laptop1 = new Laptop("ASUS ROG", p, r);

        laptop1.hidupkan();

        Processor p2 = new Processor("AMD Ryzen 5");
        RAM r2 = new RAM(8);
        Laptop laptop2 = new Laptop("Lenovo ThinkPad", p2, r2);

        laptop2.hidupkan();
    }
}