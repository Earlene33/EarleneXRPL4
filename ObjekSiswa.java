import java.util.Scanner;
public class ObjekSiswa{
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Input untuk nama siswa
        System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();

        // Input untuk usia siswa dengan validasi
        int usia = 0;
        while (true) {
            System.out.print("Masukkan usia siswa: ");
            usia = scanner.nextInt();
            if (usia > 0) {
                break;
            } else {
                System.out.println("Usia harus lebih dari 0. Coba lagi.");
            }
        }

        // Input untuk nilai siswa dengan validasi
        double nilai = -1;
        while (true) {
            System.out.print("Masukkan nilai siswa (0-100): ");
            nilai = scanner.nextDouble();
            if (nilai >= 0 && nilai <= 100) {
                break;
            } else {
                System.out.println("Nilai harus antara 0 dan 100. Coba lagi.");
            }
        }

        // Membuat objek Siswa dengan input dari pengguna
        Siswa siswa = new Siswa(nama, usia, nilai);

        // Menampilkan informasi siswa
        System.out.println("\nInformasi Siswa:");
        System.out.println("Nama: " + siswa.getNama());
        System.out.println("Usia: " + siswa.getUsia());
        System.out.println("Nilai: " + siswa.getNilai());

        scanner.close();
    }
}

    