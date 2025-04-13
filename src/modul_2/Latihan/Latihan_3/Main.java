package modul_2.Latihan.Latihan_3;

public class Main {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank();
        akun.tampilkanSaldo();

        // Akan error jika akses langsung:
        // System.out.println(akun.saldo); // ERROR: saldo has private access
    }
}
