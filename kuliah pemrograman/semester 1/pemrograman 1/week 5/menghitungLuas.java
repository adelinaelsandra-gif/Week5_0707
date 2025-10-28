import java.util.Scanner;

public static void main(String[] args) {
    Scanner ns = new Scanner(System.in);
   double sisi, alas, tinggi, luas, keliling;

   System.out.println("Masukkan sisi= ");
   sisi = ns.nextDouble();

   keliling = sisi + sisi + sisi;
   System.out.println("Keliling=" + keliling);

    System.out.println("Masukkan alas= ");
    alas = ns.nextDouble();

    System.out.println("Masukkan tinggi= ");
    tinggi = ns.nextDouble();

    luas = 0.5 * alas * tinggi;

    System.out.println("Luas= " + luas);

    ns.close();


}