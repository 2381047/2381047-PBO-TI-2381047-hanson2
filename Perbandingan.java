public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean hasilSamaDengan = a == b;
        System.out.println("a == b :" + hasilSamaDengan);

        boolean hasilTidakSamaDengan = a != b;
        System.out.println("a != b :" + hasilTidakSamaDengan);

        boolean hasilLebihBesarDari = a > b;
        System.out.println("a > b: " + hasilLebihBesarDari);

        boolean hasilLebihKecilDari = a < b;
        System.out.println("a < b: " + hasilLebihKecilDari);


    }
}