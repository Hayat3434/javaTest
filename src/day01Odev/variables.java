package day01Odev;
/*
Java Değişken Tanımlama
<veri tipi> <değişken ismi> = veri (değer)
İlk önce değişkenin veri tipini
(1-Java'da tam sayıları belirten veri tipleri Byte, Short, Integer ve Long'tur.
 2-Java'da ondalıklı yani küsuratlı sayıları belirten veri tipleri Float ve Double'dır.
 3-Java'da karakter değişkenleri saklamak için Char kullanılır.
 4-Char veri tipleri birleşerek String Sınıfından bir yapıya dönüşür.
 5-Java, mantıksal değerleri saklamak için boolean adında bir tipe sahiptir.
   Boolean sadece iki değer alabilir : True ve False)

ve değişkenin ismini yazarız ve istenirse aynı matematikteki gibi "=" eşittir ile değerini atarız.

int sayi;  deklarasyon sadece 1 kere yapilir
sayi=15;  deger atamasi istedigimiz kadar olabilir
        System.out.println(sayi); // 15
        sayi=20;
        System.out.println(sayi); // 20
        sayi = sayi+10;
        System.out.println(sayi); // 30


 */
public class variables {
    public static void main(String[] args) {
        // variable baslangic degeri verme
        int age = 32;
        int temp = 52;  //temporary
        System.out.println(age);
        System.out.println("temp = " + temp);

        // Değişkenin değerini kopyalama
        int myAge= 33;
        int hisAge = age;

        // Bir değişken ismi verilerek aynı cinsden farklı isimde değişkenler verilebilir
        int year = 2022,   month =3,  day =2;

        // Bir değişken değiştirilebilir
        year = 2032;


        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int x;
        int y =20000;
        x=123;
        y= 234;

        System.out.println("x = " + x);
        System.out.println("y = " + y);




    }
}
