public class Siswa {
    private String nama;
    private int usia;
    private double nilai;

    // Constructor untuk menginisialisasi objek Siswa
    public Siswa(String nama, int usia, double nilai) {
        this.nama = nama;
        setUsia(usia);  // Menggunakan setter untuk usia
        setNilai(nilai); // Menggunakan setter untuk nilai
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk usia
    public int getUsia() {
        return usia;
    }

    // Setter untuk usia dengan validasi
    public void setUsia(int usia) {
        if (usia > 0) {
            this.usia = usia;
        } else {
            System.out.println("Usia harus lebih dari 0.");
        }
    }

    // Getter untuk nilai
    public double getNilai() {
        return nilai;
    }

    // Setter untuk nilai dengan validasi
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus antara 0 dan 100.");
        }
    }
}
