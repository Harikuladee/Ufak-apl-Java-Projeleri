package manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        double toplamFiyat;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilogram? ");
        armutKg = input.nextInt();

        System.out.println("Elma kaç kilogram? ");
        elmaKg = input.nextInt();

        System.out.println("Domates kaç kilogram? ");
        domatesKg = input.nextInt();

        System.out.println("Muz kaç kilogram? ");
        muzKg = input.nextInt();

        System.out.println("Patlıcan kaç kilogram? ");
        patlicanKg = input.nextInt();

        toplamFiyat = armutKg * armutFiyat + elmaKg * elmaFiyat + domatesKg * domatesFiyat + muzKg * muzFiyat + patlicanKg * patlicanFiyat;

        System.out.println("Toplam Tutar: " + toplamFiyat + " TL");

        input.close();
    }
}