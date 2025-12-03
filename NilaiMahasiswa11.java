import java.util.Scanner;
public class NilaiMahasiswa11 {

    public static int[] isianArray(int jumlahMahasiswa) {
        int nilai[] = new int[jumlahMahasiswa];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        return nilai;
    }
    
    public static double hitungTotal(int ...nilaiMahasiswa) {
        double total = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }
        return total;

    }

    public static void tampilArray( int ...nilaiMahasiswa) {
        System.out.println("Nilai Mahasiswa:");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilaiMahasiswa[i]);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa:");
        int jmlMhs = input.nextInt();

        int nilaiMhs[] = isianArray(jmlMhs);
    
        tampilArray(nilaiMhs);
        double totalNilai = hitungTotal(nilaiMhs);
        System.out.println("Total nilai mahasiswa: " + totalNilai);
        input.close();
        }
    }

