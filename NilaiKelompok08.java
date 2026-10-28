import java.util.Scanner;
public class NilaiKelompok08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok =");
        int jumlahKelompok = input.nextInt();
        System.out.print("Masukkan jumlah penilaian =");
        int jumlahPenilaian = input.nextInt();


        if (jumlahKelompok <= 0 || jumlahPenilaian <= 0) {
            System.out.println("Jumlah kelompok dan penilaian > 0");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = 0;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;
                for (int j = 1; j <= jumlahPenilaian; j++) {
                    int nilai;
                    do {
                        System.out.print("Nilai dari penilai" + j + ": ");
                        nilai = input.nextInt();
                        if (nilai < 0 || nilai > 100) {
                           System.out.println(" Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }
                double rataNilai = totalNilai / jumlahPenilaian;
                System.out.println("Rata-rata kelompok " + nomorKelompok + " : nilai rata-rata" + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }
                    

                nomorKelompok++;
            }
             System.out.println("========================================");
                    System.out.println("Kelompok Terbaik :" + kelompokTerbaik);
                     System.out.println("Rata-rata tertinggi : " + rataTertinggi);
                }
        } 
        
      
        

    }
    

