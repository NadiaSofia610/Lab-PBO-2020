
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus bus = new Bus();
        boolean check = true;

        /**
         * Mengulang program sampai user menginput pilihan selain dari pilihan 1, 2, dan 3
         */
        while(check) {
            System.out.println("");
            System.out.println("========== BUS TRANS KOETARADJA ==========");
            System.out.println("");
            System.out.println("MENU :");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Quit");
    
            System.out.print("Pilihan : ");
            int pil = sc.nextInt();

        
            if(pil == 1) {
                System.out.println("");
                System.out.print("Nama        : ");
                sc.nextLine();
                String nama = sc.nextLine();
    
                System.out.print("Umur        : ");
                int umur = sc.nextInt();
    
                System.out.print("Hamil (y/n) : ");
                sc.nextLine();
                String cekHamil = sc.nextLine();
                boolean hamil;
                if (cekHamil.equals("y")) {
                    hamil = true;
                }
                else {
                    hamil = false;
                }
                
                Penumpang p = new Penumpang(nama, umur, hamil);
                bus.NaikPenumpang(p);
                System.out.println("");
                bus.tampilan();
            }
            else if(pil == 2) {
                System.out.print("Nama : ");
                sc.nextLine();
                String nama = sc.nextLine();
                bus.turunkanPenumpang(nama);
                System.out.println("");
                bus.tampilan();
            }
            else if(pil == 3){
                System.out.println("");
                bus.tampilan();
            }
            else {
                check = false;
            }
        }
    }  
}