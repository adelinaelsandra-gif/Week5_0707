import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int nilaiMtk;;
        int nilaiInggris;
        int fisika;

        System.out.print("Masukkan nilai Mtk= ");
        nilaiMtk = ns.nextInt();

        System.out.print("Masukkan nilai Inggris");
        nilaiInggris = ns.nextInt();

        System.out.print("Masukkan nilai fisika");
        fisika = ns.nextInt();

        if (nilaiMtk == 75 && nilaiInggris !=75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus Lulus");
        }

        if (nilaiInggris > 90 || fisika < 75) {
            System.out.println("Anda Pintar");
        } else {
            System.out.println("Harus lebih belajar");
        
        }
            
    }
}
            
        
    

