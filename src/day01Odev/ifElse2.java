package day01Odev;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1,sayi2,sonuc,secim;
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bolme");
        System.out.println("Seçim yap");
        secim = scan.nextInt();

        System.out.println("iki tam sayi gir");
        sayi1 = scan.nextInt();
        sayi2 = scan.nextInt();

        if(secim==1){
            sonuc = sayi1+sayi2;
            System.out.println("Toplama sonucu"+sonuc);
        }else if(secim==2){
            sonuc =sayi1-sayi2;
            System.out.println("Çıkarma sonuc"+sonuc);
        }else if(secim == 3){
            sonuc = sayi1*sayi2;
            System.out.println("Çarpma sonuc"+sonuc);

        }else if(secim ==4){
            sonuc = sayi1 / sayi2;
            System.out.println("Bölme saonucu"+sonuc);

        }

    }
}
