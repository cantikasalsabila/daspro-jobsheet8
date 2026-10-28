import java.util.Scanner;
public class Tugas3_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       int jumlahToko;
       do {
        System.out.print("Masukkan jumlah toko = ");
        jumlahToko = input.nextInt();
        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1. Ulangi input!");
        }
       } while (jumlahToko < 1);
       int totalSemua = 0;
       int barangTerbanyak = -1;
       int tokoTerbanyak = 0;

       String ringkasan = "";

       for (int toko = 1; toko <=jumlahToko; toko++){
        int jumlahPelanggan;
        do{
            System.out.print("Toko " + toko + " - jumlah pelanggan = ");
            jumlahPelanggan = input.nextInt();
            if (jumlahPelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif. Ulangi input!");
            }
        } while (jumlahPelanggan < 0);
        int totalToko = 0;
        for (int p = 1; p <= jumlahPelanggan; p++){
            int barang;
            do {
                System.out.print("Pelanggan " + p + " - jumlah barang =  ");
                barang = input.nextInt();
                if (barang < 0) {
                    System.out.println("  Tidak boleh negatif. Ulangi input!");
                }
            } while (barang < 0);
            totalToko += barang;
        }
        totalSemua += totalToko;
        ringkasan += "Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalToko + "\n";

        if (totalToko > barangTerbanyak) {
            barangTerbanyak = totalToko;
            tokoTerbanyak = toko;
        }
       }
       System.out.println("");
       System.out.println(ringkasan);   
       System.out.println("Total barang seluruh toko: " + totalSemua);
       System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        input.close();


    }
    
}
