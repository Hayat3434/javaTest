package day01Odev;

public class booleanSample {
    public static void main(String[] args) {
        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }

        /*
        int children = 0;
        b = children; // Will not work
        if (children) { // Will not work
            // Will not work
        }

        int a;
        boolean b = true;
        boolean c = false;
        a = b + c;            //The following line will give an error
        System.out.println(a);

         */
        //Java, koşulları değerlendirmek için boole değişkenlerini kullanır.
        // Boole değerleri trueve falsebir ifade karşılaştırıldığında veya değerlendirildiğinde döndürülür. Örneğin:
        int a = 4;
        boolean  c = a == 4;

        if (c) {
            System.out.println("It's true!");
        }

        int a1 = 4;
        int b1 = 5;
        boolean result;
        result = a1 < b1; // true
        System.out.println("result = " + result);
        result = a1 > b1; // false
        System.out.println("result = " + result);
        result = a1 <= 4; // a smaller or equal to 4 - true
        result = b1 >= 6; // b bigger or equal to 6 - false
        result = a1 == b1; // a equal to b - false
        result = a1 != b1; // a is not equal to b - true
        result = a1 > b1 || a1 < b1; // Logical or - true
        result = 3 < a1 && a1 < 6; // Logical and - true
        result = !result; // Logical not - false
    }
}
