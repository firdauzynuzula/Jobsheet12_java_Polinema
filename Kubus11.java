import java.util.Scanner;
public class Kubus11 {
    public static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();
        System.out.flush();
        int volume = hitungVolume(sisi);
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah " + volume);

        int luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah " + luasPermukaan);

        input.close();
    }
}
