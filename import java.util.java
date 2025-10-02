import java.util.Scanner;

/**
 * Program untuk menghitung hasil pangkat dua (kuadrat) dari sebuah bilangan
 * menggunakan algoritma iteratif (penjumlahan berulang).
 */
public class PerpangkatanIteratif {

    /**
     * Fungsi utama yang menjalankan program.
     */
    public static void main(String args) {
        // Inisialisasi objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat (n) untuk dihitung kuadratnya: ");

        // Membaca input bilangan bulat dari pengguna
        int n = scanner.nextInt();

        // Variabel untuk menyimpan hasil perhitungan
        int hasil = 0;

        // Melakukan perulangan iteratif sebanyak n kali
        // Logika: n^2 = n + n +... + n (sebanyak n kali)
        for (int i = 0; i < n; i++) {
            hasil += n;
        }

        // Menampilkan hasil perhitungan
        System.out.println("Hasil kuadrat dari " + n + " adalah " + hasil);

        // Menutup objek Scanner
        scanner.close();
    }
}