public class PengunjungCafe11 {
    static void daftarPengunjung(String ...namaPengunjung){
        System.out.println("Daftar Pengunjung Cafe:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }

        for (String string : namaPengunjung) {
            System.out.println("* " + string);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

        daftarPengunjung();
    }   
}
