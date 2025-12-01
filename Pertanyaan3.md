Pertanyaan
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return
value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh
dari program kafe pada Percobaan 3 untuk masing-masing kasus.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan
pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua
buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing
parameter dalam konteks program kafe.
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima
kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari
totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka
mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode
promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga
totalHarga.
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta
menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga
pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3
sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis
menu)? 


JAWAB:
1. Fungsi membutuhkan nilai kembalian (return value) ketika hasil dari fungsi tersebut diperlukan untuk digunakan di bagian lain dari program. Contohnya adalah fungsi hitungTotalHargaNoAbsen yang mengembalikan total harga pesanan sehingga dapat ditampilkan kepada pelanggan. Fungsi tidak perlu mengembalikan nilai ketika tujuannya hanya untuk melakukan aksi tertentu tanpa perlu memberikan hasil kembali, seperti fungsi tampilkanMenu yang hanya menampilkan daftar menu tanpa perlu mengembalikan nilai apapun.
2. Tipe data nilai kembalian dari fungsi hitungTotalHargaNoAbsen adalah int, yang mewakili total harga pesanan dalam bentuk angka bulat. Dua parameter yang digunakan adalah pilihanMenu (int) dan jumlahPesanan (int). pilihanMenu menunjukkan jenis menu yang dipilih oleh pelanggan (misalnya 1 untuk kopi, 2 untuk teh, dll), sedangkan jumlahPesanan menunjukkan berapa banyak item dari menu tersebut yang dipesan oleh pelanggan.

3. Berikut adalah modifikasi kode untuk fungsi hitungTotalHargaNoAbsen yang menerima kodePromo:


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
        
      System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
      pilihanMenu = sc.nextInt();
      System.out.print("Masukkan jumlah item yang ingin dipesan: ");
      banyakItem = sc.nextInt();
      sc.nextLine(); // Clear buffer dari nextInt()
      System.out.print("Masukkan kode Diskon (DISKON50/DISKON30): ");
      kodePromo = sc.nextLine();

      int totalHarga = HitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
      System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);

4. Untuk memodifikasi program sehingga pengguna dapat memesan lebih dari satu jenis menu sekaligus dan menampilkan total keseluruhan pesanan, kita dapat menggunakan loop untuk meminta input menu dan jumlah item berulang kali hingga pengguna selesai memesan. Berikut adalah contoh modifikasi kode:

    int totalKeseluruhan = 0;
    String lanjutPesan;

    do {
        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        banyakItem = sc.nextInt();
        sc.nextLine(); // Clear buffer dari nextInt()
        System.out.print("Masukkan kode Diskon (DISKON50/DISKON30): ");
        kodePromo = sc.nextLine();

        int totalHarga = HitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        totalKeseluruhan += totalHarga;

        System.out.print("Apakah Anda ingin memesan menu lain? (ya/tidak): ");
        lanjutPesan = sc.nextLine();
    } while (lanjutPesan.equalsIgnoreCase("ya"));

    System.out.println("Total keseluruhan harga untuk semua pesanan Anda: Rp " + totalKeseluruhan);