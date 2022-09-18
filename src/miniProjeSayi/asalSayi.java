package miniProjeSayi;

public class asalSayi {
    public static void main(String[] args) {
        int number = 23;
        //Bir sayının başka bir sayıya bölümünden kalanı veren operatör % mod da denir
        int remainder = number %2;
        System.out.println(remainder);//25 in 2 bolumunden kalan
        //Asal sayı 1 ve kendinden başka pozitif böleni olmayan

        boolean isPrime = true;//sayıyı asal kabul edelim
        for (int  i =2; i< number; i++ ){
            if(number % i == 0){
                isPrime= false;
            }
        } if(isPrime){
            System.out.println("Sayi Asaldir");
        }else{
            System.out.println("Asal değildir");
        }

    }
}
