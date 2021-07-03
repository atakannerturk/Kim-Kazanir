// 1181602012 Ali Atakan Küçük
// 1181602018 Atakan Ertürk

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Veriler veriler = new Veriler();
        System.out.println("-----------------------------ARAC LISTESI----------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(veriler.AracListesi().get(i));
        }
        System.out.println("-----------------------------SURUCU LISTESI----------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(veriler.SurucuListesi().get(i));
        }
        int aracNumarasi;
        int surucuNumarasi;
        System.out.println("-----------------------------ARAÇ VE SÜRÜCÜ SEÇİMİ----------------------------");

        while(true){
            System.out.print("Bir Arac Numarasi Seciniz:");
            aracNumarasi = input.nextInt();
            if(aracNumarasi <= 0 || aracNumarasi >=11){
                System.out.println("Bu Sayi Gecersiz!");
                continue;
            }
            break;
        }

        while(true){
            System.out.print("Bir Surucu Numarasi Seciniz:");
            surucuNumarasi = input.nextInt();
            if(surucuNumarasi <= 0 || surucuNumarasi >= 11){
                System.out.println("Bu Sayi Gecersiz!");
                continue;
            }
            break;
        }
        System.out.print("Sectiginiz Arac ve Surucuye Gore Yarış Kazanma İhtimali(%): ");
        System.out.println(veriler.VeriToplam(aracNumarasi, surucuNumarasi));
    }
}
