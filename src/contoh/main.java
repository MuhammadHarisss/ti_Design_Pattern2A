package contoh;

public class main {
    public static void main(String[] args) {
        System.out.println("Dasar OOP");

        Employee Employee1 = new Employee("Haris", 1000000, 0.2);
        System.out.println(Employee1.getNama()+" total gaji: "+Employee1.getGajiTotal());

        AksesModifier contoh = new AksesModifier();
        System.out.println(contoh.aksesPublic);
    }
}
