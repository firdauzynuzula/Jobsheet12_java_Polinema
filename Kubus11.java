import java.util.Scanner;
public class Kubus11 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();
        System.out.flush();
        int volume = sisi * sisi * sisi;


        System.out.println("Volume kubus dengan sisi " + sisi + " adalah " + volume);

        int luasPermukaan = 6 * sisi * sisi;
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah " + luasPermukaan);

        input.close();
    }
}
