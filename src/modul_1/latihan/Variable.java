package modul_1.latihan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Variable {
    public static void main(String[] args) {
        String NamaLengkap = "Muhammad Haris";
        String TempatLahir = "Kutablang, Lhokseumawe";
        LocalDate TanggalLahir = LocalDate.of(2005, 2, 13);
        char GolonganDarah = 'O';
        int Umur = 19;
        double Tinggi = 1.78;
        char JenisKelamin = 'L';
        String Agama = "Islam";
        String Pekerjaan = "Mahasiswa";

        DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String TanggalLahirFormatted = TanggalLahir.format(formatTanggal);

        System.out.println("Nama: " + NamaLengkap);
        System.out.println("Tempat Lahir: " + TempatLahir);
        System.out.println("Tanggal Lahir: " + TanggalLahirFormatted);
        System.out.println("Golongan Darah: " + GolonganDarah);
        System.out.println("Umur: " + Umur);
        System.out.println("Tinggi: " + Tinggi);
        System.out.println("Jenis Kelamin: " + JenisKelamin);
        System.out.println("Agama: " + Agama);
        System.out.println("Pekerjaan: " + Pekerjaan);
    }
}
