package day01Odev;

public class for_while_do {
    public static void main(String[] args) {
        for(int i=0; i<=9;i++){
            System.out.print(i+",");
        }
        System.out.print(10);
        System.out.println("\nFor Döngüsü bitti");

        System.out.println("*******While Başlıyor*********");

        int i=1;
        while (i<10){
            System.out.println(i);
            i+=2;    //i while içinde artırmazak sonsuz döngüye girer

        }
        System.out.println("*******While Bitti*********");
        System.out.println("***********Do While Başlıyor**********");
        int j=2;
        //Şart uymazsa bile birkez bu döngü çalışacaktır.
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("*****Do-While Bitti");

    }
}
