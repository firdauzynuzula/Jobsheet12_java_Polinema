import java.util.Scanner;
public class NilaiMahasiswa11 {

    public static int[] isianArray(int jumlahMahasiswa) {
        int nilaiMahasiswa[] = new int[jumlahMahasiswa];
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + i + ": ");
            nilaiMahasiswa[i-1] = input.nextInt();
        }
        input.close();
        System.out.flush();
        return nilaiMahasiswa;
    }
    
    public static double hitungTotal(int ...nilaiMahasiswa) {
        double total = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }
        return total;

    }

    public static void tampilArray(int... nilaiMahasiswa) {
        System.out.println("\n");
        System.out.println("Nilai Mahasiswa: ");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilaiMahasiswa[i]);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = input.nextInt();

        // array untuk menyimpan nilai mahasiswa
        int nilaiMhs[] = isianArray(jmlMhs);

        // menampilkan nilai mahasiswa
        tampilArray(nilaiMhs);

        // menghitung total nilai mahasiswa
        double totalNilai = hitungTotal(nilaiMhs);
        System.out.println("Total nilai mahasiswa: " + totalNilai);
        input.close();
        }
    }

