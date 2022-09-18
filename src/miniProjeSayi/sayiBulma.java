package miniProjeSayi;

public class sayiBulma {
    public static void main(String[] args) {
        int [] sayilar = new int[]{1,2,3,7,9,10};
        int aranacak =9;
        boolean varmi = false;
        for(int sayi:sayilar){
            if (sayi==aranacak){
                varmi=true;
                break;
            }
        }
        if (varmi){
            System.out.println("Saayi var");
        }else{
            System.out.println("sayi yok");

    }
}
}

