package day01Odev;

import java.util.Scanner;

public class forUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Üçgen için satır sayısı giriniz: ");
        int SatirSayisi = scan.nextInt();
        //dış for kaç satır olacağını yazıyor i=1 iken k=0 iken iç for çalışacak ve bir * basacask
        //i=2 iken iç for iki ** basacak şart bozulana kadar devam edecek
        for(int i =1;i<=SatirSayisi;i++){
            //her satır için burdaki for çalışacak ve * basacak
            for(int k=0;k<i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
