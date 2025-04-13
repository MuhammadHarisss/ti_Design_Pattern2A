public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] mahasiswa = {"Haris", "Razi", "Aulia", "Yazid"};

        System.out.println("Elemen pertama dari array numbers: " + numbers[0]);
        System.out.println("Elemen pertama dari array mahasiswa: " + mahasiswa[0]);

        System.out.println("Jumlah elemen dalam array numbers: " + numbers.length);

        System.out.println("Isi array numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
