package day01Odev;

public class RecapDemo2 {
    public static void main(String[] args) {
        //double[] myList = new double[4];
        //dizinin içine toplu olarakta veri girebiliriz
        double[] myList ={1.2,6.3,4.3,5.6};
        double total =0;
        double enBuyukSayi=myList[0];//Burda  biz enuyuk sayıyı tanımlayarak diğerleri ile karsılastırma yapacağız
        //ve dizideki her sayı karşılaştırılarak sonuc yazdırılacak
        for(double number:myList){
            if(enBuyukSayi<number){
                enBuyukSayi=number;
            }
            total =total + number;
            System.out.print(number+" + " );
        }
        System.out.println("--->Toplam:"+total);
        System.out.println("En büyük sayi:"+enBuyukSayi);
    }
}
