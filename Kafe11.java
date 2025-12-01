import java.util.Scanner;


public class Kafe11 {

    public static void Menu(String namaPelanggan, boolean isMember , String KodePromo) {
      System.out.println("Selamat datang, " + namaPelanggan + "!");

      if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
      }

      if (KodePromo.equals("DISKON50")) {
        System.out.println("Diskon 50%");
      }
      else if (KodePromo.equals("DISKON30")) {
        System.out.println("Diskon 30%");
      } else {
        System.out.println("kode invalid");
      }


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

    public static int HitungTotalHarga(int piihanMenu, int banyakItem) {
      int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

      int hargaTotal = hargaItems[piihanMenu - 1] * banyakItem;
      return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihanMenu, banyakItem;

      System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
      pilihanMenu = sc.nextInt();

      System.out.print("Masukkan jumlah item yang ingin dipesan: ");
      banyakItem = sc.nextInt();

      int totalHarga = HitungTotalHarga(pilihanMenu, banyakItem);
      System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);

        Menu("Andi", true, "DISKON30");
    }
}