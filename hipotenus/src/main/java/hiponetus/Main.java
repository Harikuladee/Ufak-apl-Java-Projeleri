package hiponetus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kisaKenar, uzunKenar;
        double hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.println("Dik üçgenin kısa kenarını giriniz: ");
        kisaKenar = input.nextInt();

        System.out.println("Dik üçgenin uzun kenarını giriniz: ");
        uzunKenar = input.nextInt();
        
        hipotenus = Math.sqrt(Math.pow(kisaKenar, 2) + Math.pow(uzunKenar, 2));

        System.out.println("Hipotenüs: " + hipotenus);

        input.close();

    }
}