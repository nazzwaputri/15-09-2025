
import java.util.Scanner;

public  class TebakAngka{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int angka = 2;
    int tebakan = 0;

    while (tebakan != angka) {
        System.out.println("Masukkan Tebakan Anda : ");
        tebakan = input.nextInt();

        if (tebakan < angka) {
            System.out.println("Tebakan Anda Terlalu Rendah");
        } else if (tebakan > angka) {
            System.out.println("Tebakan Anda Terlalu Tinggi");
        } else {
            System.out.println("Selamat, Tebakan Anda Benar!");
        }
}
}

}


