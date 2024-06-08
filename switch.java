package switch2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int pil, porsi, harga = 0;
        System.out.println("Menu Makanan Rolzzz kedai");
        System.out.println("=========================");
        System.out.println("1. Burger\n2. Ayam Geprek\n3. Ayam Krispi\n3. Mie Ayam");
        System.out.print("Pilih Makanan : ");
        pil = masuk.nextInt();
        switch (pil) {
            case 1:
                System.out.print("porsi :");
                porsi = masuk.nextInt();
                System.out.println("Burger (35k)");
                harga = 35000 * porsi;
                break;
            case 2:
                System.out.print("porsi :");
                porsi = masuk.nextInt();
                System.out.println("Ayam Geprek (15k)");
                harga = 15000 * porsi;
                break;
            case 3:
                System.out.print("porsi :");
                porsi = masuk.nextInt();
                System.out.println("Mie Ayam (12k)");
                harga = 12000 * porsi;
                break;
            default:
                System.out.println("Pilihan Anda tidak sesuai, silahkan pilih lagi");
                break;
        }
         System.out.println("===================");
         System.out.println("Total : Rp. " + harga);
    }
}