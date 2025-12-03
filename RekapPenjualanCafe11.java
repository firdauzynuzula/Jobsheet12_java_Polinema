import java.util.Scanner;

public class RekapPenjualanCafe11 {

    // Deklarasi array untuk menu dan penjualan
    public static String[] menu = {};
    public static int[][] penjualan = {};
    public static Scanner sc = new Scanner(System.in);


    // Fungsi untuk inputan dinamis menu
    public static void inputanDinamisMenu(int jumlahHari) {
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }
    }

    // Fungsi untuk inputan dinamis hari
    public static int inputanDinamisHari() {
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = sc.nextInt();

        for (int i = 0; i < menu.length; i++) {
            penjualan[i] = new int[jumlahHari];
        }
        return jumlahHari;
    }

    // Fungsi untuk inputan Data Penjualan dengan array dinamis
    public static void inputDataPenjualan(int jumlahHari) {
        System.out.println("====Input Data Penjualan Selama " + jumlahHari + " Hari====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Nama Menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Penjualan Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan data penjualan
    public static void tampilkanDataPenjualan(int jumlahHari) {
        System.out.println("\n====Data Penjualan Selama " + jumlahHari + " Hari====");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= jumlahHari; i++) {
            System.out.print("H" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + (menu[i].length() < jumlahHari ? "\t" : "\t\t"));
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    
    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void menuPenjualanTertinggi(int jumlahHari) {
        int maxPenjualan = 0;
        int indexMenuTertinggi = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            if (total > maxPenjualan) {
                maxPenjualan = total;
                indexMenuTertinggi = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + menu[indexMenuTertinggi]);
        System.out.println("Total penjualan: " + maxPenjualan);
    }


    // Fungsi untuk menghitung rata-rata penjualan per menu
    public static void rataRataPenjualan(int jumlahHari) {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < menu.length; i++) {
            double total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rataRata = total / jumlahHari;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Gagal membersihkan layar.");
        }
    }

    public static void main(String[] args) {
        // deklarasi variabel untuk fungsi dinamis
        int jumlahHari = inputanDinamisHari();

        // pemanggilan fungsi inputan dinamis menu
        inputanDinamisMenu(jumlahHari);

        // pemanggilan fungsi input data penjualan
        inputDataPenjualan(jumlahHari);

        clearScreen();
        tampilkanDataPenjualan(jumlahHari);
        menuPenjualanTertinggi(jumlahHari);
        rataRataPenjualan(jumlahHari);
    }
}
