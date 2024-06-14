package sayilarisiralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;
        String siralama;

        System.out.print("Sıralama türünü giriniz (</>): ");
        siralama = inp.nextLine();

        System.out.print("1. Sayıyı giriniz: ");
        a = inp.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        b = inp.nextInt();

        System.out.print("3. Sayıyı giriniz: ");
        c = inp.nextInt();

        inp.close();

        if (siralama.equals("<")) {
            if (a <= b && a <= c) {
                System.out.print(a + " < ");
                if (b <= c) {
                    System.out.println(b + " < " + c);
                } else {
                    System.out.println(c + " < " + b);
                }
            } else if (b <= a && b <= c) {
                System.out.print(b + " < ");
                if (a <= c) {
                    System.out.println(a + " < " + c);
                } else {
                    System.out.println(c + " < " + a);
                }
            } else {
                System.out.print(c + " < ");
                if (a <= b) {
                    System.out.println(a + " < " + b);
                } else {
                    System.out.println(b + " < " + a);
                }
            }
        } else if (siralama.equals(">")) {
            if (a >= b && a >= c) {
                System.out.print(a + " > ");
                if (b >= c) {
                    System.out.println(b + " > " + c);
                } else {
                    System.out.println(c + " > " + b);
                }
            } else if (b >= a && b >= c) {
                System.out.print(b + " > ");
                if (a >= c) {
                    System.out.println(a + " > " + c);
                } else {
                    System.out.println(c + " > " + a);
                }
            } else {
                System.out.print(c + " > ");
                if (a >= b) {
                    System.out.println(a + " > " + b);
                } else {
                    System.out.println(b + " > " + a);
                }
            }
        } else {
            System.out.println("Geçersiz sıralama türü.");
        }
    }
}