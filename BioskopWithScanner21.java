import java.util.Scanner;
public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner bebi21 = new Scanner (System.in);
        int baris,kolom;
        String nama,next;

        String [][] penonton = new String [4][2];
        while (true) {
            System.out.println("Masukkan nama  : ");
            nama = bebi21.nextLine();
            System.out.println("Masukkan baris : ");
            baris = bebi21.nextInt();
            System.out.println("Masukkan kolom :");
            kolom = bebi21.nextInt();
            bebi21.nextLine();

            penonton[baris-1][kolom-1] = nama;
            System.out.print("Input penonton lainnya? (y/n): ");
            next = bebi21.nextLine();

            if(next.equalsIgnoreCase("n")){
                break;
            }

            
        }
    }
    
}
