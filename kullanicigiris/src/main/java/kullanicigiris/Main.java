package kullanicigiris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String kullaniciAdi, sifre;
        int girisHakki = 3;
        String sysKullaniciAdi = "patika";
        String sysSifre = "java123";
        
        while (girisHakki > 0) {
            System.out.print("Kullanıcı Adı: ");
            kullaniciAdi = inp.nextLine();
            System.out.print("Şifre: ");
            sifre = inp.nextLine();

            if (kullaniciAdi.equals(sysKullaniciAdi) && sifre.equals(sysSifre)) {
                System.out.println("Giriş Başarılı");
                break;
            } else {
                girisHakki--;
                System.out.println("Kullanıcı adı veya şifre hatalı! Tekrar deneyin.");
                if (girisHakki == 0) {
                    System.out.println("Giriş hakkınız bitti. Daha sonra tekrar deneyin.");
                } else {
                    System.out.println("Kalan giriş hakkınız: " + girisHakki);
                }
            }
        inp.close();
        }
    }
}