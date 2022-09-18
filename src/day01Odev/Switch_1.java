package day01Odev;

public class Switch_1 {
    public static void main(String[] args) {
        char grade = 'Z';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel Geçtiniz");
                break;
            case'B':
                System.out.println("Çok güzel Geçtiniz");
                break;
            case'C':
                System.out.println(" Geçtiniz");
                break;
            case'D':
                System.out.println("Fena Geçtiniz");
                break;
            case'E':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçerli Not Giriniz");
        }
    }
}
