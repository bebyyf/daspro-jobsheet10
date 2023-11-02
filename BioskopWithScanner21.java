import java.util.Scanner;
public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner bebi21 = new Scanner (System.in);
        int baris,kolom;
        String nama,next;

        String [][] penonton = new String [4][2];
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu (1/2/3) : ");
            int menu = bebi21.nextInt();
            bebi21.nextLine();

            switch (menu) {
                case 1:
                System.out.println("=============INPUT DATA PENONTON============");
                System.out.println("Masukkan nama  : ");
                nama = bebi21.nextLine();
                System.out.println("Masukkan baris : ");
                baris = bebi21.nextInt();
                System.out.println("Masukkan kolom :");
                kolom = bebi21.nextInt();
                bebi21.nextLine();

                if (baris >=1 && baris <=4 &&kolom >= 1 && kolom<=2){
                    if(penonton[baris- 1][kolom -1] == null){
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data berhasil disimpan");
                }else{
                    System.out.println("Kursi telah terisi, silahkan coba lagi");
                }}else{
                    System.out.println("Baris atau kolom tidak tersedia");

                }
                break;

                case 2:
                System.out.println("=============DAFTAR PENONTON============");
                for (int i=0; i < penonton.length; i++){
                    for (int j = 0; j<penonton[i].length; j++){
                        if (penonton[i][j] !=null){
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ":" +penonton[i][j]);
                        }else{
                            penonton[i][j] = "***";
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ":" + penonton[i][j]);
                        }
                    }
                }
                break;

                case 3:
                System.out.println("Pemesanan Tersimpan, Terimakasih atas pemesanannya");
                System.exit(0);
                default:
                System.out.println("Program error, Silahkan coba lagi");
            }

            System.out.print("Pilih menu lainnya? (y/n): ");
            next = bebi21.nextLine();

            if(next.equalsIgnoreCase("n")){
                break;
            }

            
        }
    }
    
}
