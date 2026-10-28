import java.util.Scanner;
public class Tugas1_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n =");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("n minimal 1");
        } else {
            int total = 0 ;

            for (int i = 1; i <=n; i++ ){
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    total ++;
                }
                System.out.println();

            }
            System.out.println("Total angka yang dicetak = " + total);

        }
        input.close();
    }
       
    
}
