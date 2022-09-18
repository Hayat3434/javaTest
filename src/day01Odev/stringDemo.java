package day01Odev;

import java.util.Locale;

public class stringDemo {
    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel.";
        //Stringler bir karekter dizisidir
        System.out.println(mesaj);
        System.out.println("Eleman Sayısı " +mesaj.length());
        System.out.println("4 .eleman : "+mesaj.charAt(4));//sıradaki elemanı char At ile buluruz
        //iki stringi birleştirmek için concat kullanıyoruz
        System.out.println(mesaj.concat(" Yaşasın"));
        //Stringin başladığı karekterin true yada false olmasını startwiths ile bakabiliriz
        System.out.println(mesaj.startsWith("B"));
        //Stringin sonunnada endWith ile bakarız
        System.out.println(mesaj.endsWith(";"));
        //karekterleri almak için getChars() arayine atayarak olkuma yapabiliriz
        char[] karekter = new char[5];
        mesaj.getChars(0,5,karekter,0);
        System.out.println(karekter);
    //mesaj içindeki harf varmı ona bakar ilk bulduğunu verir baştan başlar
        System.out.println(mesaj.indexOf('a'));
        //bu da sondan başlar kaçıncıda bulduğuna bakarr
        System.out.println(mesaj.lastIndexOf('a'));

        String yeniMesaj=  mesaj.replace(' ','-');
        System.out.println(mesaj);
        System.out.println(yeniMesaj);

        //Substring ile bir metnin içerisinden parça alırız mesajın 2 indexinden itibaren yani g den alır
        System.out.println(mesaj.substring(2));
        //belirli parçayı almak için
        System.out.println(mesaj.substring(2,5));
        //kelimeleri ayırma işlemi içn dizi olduğundan for ile yapalım
        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        //Metinini başındaki ve sonundaki boşluklşarı atalım
       String mesaj2 ="    Boşluklara bak kalktı    ";
        System.out.println(mesaj2);
        System.out.println(mesaj2.trim());
    }
}
