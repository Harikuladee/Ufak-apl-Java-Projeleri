package hesapmakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int a, b;
        String operation;

        System.out.print("İlk sayıyı giriniz: ");
        a = scanner.nextInt();

        System.out.println("( + ) \n( - ) \n( * ) \n( / )");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        operation = scanner.next();

        System.out.print("İkinci sayıyı giriniz: ");
        b = scanner.nextInt();

        switch (operation) {
            case "+":
                System.out.println("Sonuç: " + (a + b));
                break;
            case "-":
                System.out.println("Sonuç: " + (a - b));
                break;
            case "*":
                System.out.println("Sonuç: " + (a * b));
                break;
            case "/":
                System.out.println("Sonuç: " + (a / b));
                break;
            default:
                System.out.println("Geçersiz işlem!");
                break;
        }
        scanner.close();
    }
}