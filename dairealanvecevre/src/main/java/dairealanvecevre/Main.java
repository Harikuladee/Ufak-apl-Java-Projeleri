package dairealanvecevre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        double alan = Math.PI * Math.pow(r, 2);
        double cevre = 2 * Math.PI * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

        input.close();
    }
}