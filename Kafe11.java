import java.util.Scanner;


public class Kafe11 {

    public static int HitungTotalHarga(int pilihanMenu, int banyakItem, String KodePromo) {
      
      
      int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
      if (KodePromo.equals("DISKON50")) {
         System.out.println("Kode valid");  
        int hargaTotal = (hargaItems[pilihanMenu - 1] * banyakItem) / 2;
        return hargaTotal;
      }else if (KodePromo.equals("DISKON30")) {
         System.out.println("Kode valid");  
        int hargaTotal = (hargaItems[pilihanMenu - 1] * banyakItem * 70) / 100;
        return hargaTotal;
      }
        System.out.println("Kode promo invalid");  
      int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
      

    }

    public static void TampilkanMenu() {
           System.out.println("===== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihanMenu, banyakItem;
        String kodePromo;
        int totalKeseluruhan = 0;
        String lanjutPesan;

      TampilkanMenu();
do {
  System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
  pilihanMenu = sc.nextInt();
  System.out.print("Masukkan jumlah item yang ingin dipesan: ");
  banyakItem = sc.nextInt();
  sc.nextLine(); // Clear buffer dari nextInt()
  System.out.print("Masukkan kode Diskon (DISKON50/DISKON30): ");
  kodePromo = sc.nextLine();

  int totalHarga = HitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
  System.out.println("Total pesanan Anda: Rp " + totalHarga);
   totalKeseluruhan += totalHarga;



  System.out.print("Apakah Anda ingin memesan lagi? (ya/tidak): ");
  lanjutPesan = sc.nextLine();
} while (lanjutPesan.equals("ya"));
 System.out.println("Total keseluruhan harga untuk semua pesanan Anda: Rp " + totalKeseluruhan);
        sc.close();
    }
} 