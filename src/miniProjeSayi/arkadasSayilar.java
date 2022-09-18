package miniProjeSayi;

public class arkadasSayilar {
    //220-284 kendileri haric pozitif tam bölenleri kendine esit
    public static void main(String[] args) {
        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;
        for (int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                toplam1=toplam1+i;
            }
        }
        for(int i=1;i<sayi2;i++){
            if(sayi2%i==0){
                toplam2 = toplam2 +i;
            }
        }
        if(sayi1==toplam2 && sayi2==toplam1){
            System.out.println("Akadaş Sayılar");
        }else{
            System.out.println("Arkadas Değil");
        }
    }
}
