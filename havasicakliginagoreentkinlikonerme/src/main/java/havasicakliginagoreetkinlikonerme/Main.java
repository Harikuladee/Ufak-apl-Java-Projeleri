package havasicakliginagoreetkinlikonerme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklık giriniz: ");
        heat = inp.nextInt();
        inp.close();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat >= 15 && heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}