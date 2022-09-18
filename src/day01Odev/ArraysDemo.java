package day01Odev;

public class ArraysDemo {
    public static void main(String[] args) {
        String ogrenci1="Veli";
        String ogrenci2="Deli";
        String ogrenci3="Zeli";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("\nDizi Tanımlama örneği");
        String [] ogrenciler = new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="VELİ";
        ogrenciler[2]="HASAN";
        ogrenciler[3]="Zeynep";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        //Bu for each ornegi dizimiz strinlerden olusuyordu forun içine string bir değişken tanımladık
        //sonrada onu : ile ogrenciler dizisini gezmesini öğrettik ve sout ile yazdırdık
        for(String ogrenci:ogrenciler){
            System.out.print(ogrenci+",");
        }
    }
}
