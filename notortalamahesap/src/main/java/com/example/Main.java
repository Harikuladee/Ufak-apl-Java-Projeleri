package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        Matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        Fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        Kimya = input.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        Turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        Tarih = input.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        Muzik = input.nextInt();

        int toplam = Matematik + Fizik + Kimya + Turkce + Tarih + Muzik;
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız: " + sonuc);
        System.out.println(sonuc >= 60 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.");

        input.close();
    }
}