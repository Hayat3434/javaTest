package miniProjeSayi;

public class mukemmelSayi {
    public static void main(String[] args) {
        //kendinden baska tum pozitif bolenlerinin Toplamı kendisine eşit olan sayı
        //6---> 1,2,3
        //28-->1,2,4,7,14
        int number = 6;
        int toplam=0;
        for (int i=1;i <number;i++){
            if(number%i==0){
                toplam = toplam+i;
            }
        }if (toplam==number){
            System.out.println("Mukemmel Sayı");
        }else{
            System.out.println("MKS Değil");
        }
    }
}
