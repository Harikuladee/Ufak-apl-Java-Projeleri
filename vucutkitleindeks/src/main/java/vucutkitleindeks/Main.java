package vucutkitleindeks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy, vki;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen kilonuzu (kilogram cinsinde) giriniz: ");
        kilo = input.nextInt();

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        vki = kilo / Math.pow(boy, 2);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);

        input.close();
    }
}