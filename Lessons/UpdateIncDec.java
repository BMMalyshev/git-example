package Lessons;

public class UpdateIncDec {
    public static void main(String[] args) {
        var a = 0;
        System.out.println(a);

        a = 5;
        System.out.println(a);

        a = a + 2;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        a ++; // a +=1 инкремент //ну и по аналогии: а -- декремент
        System.out.println(a);

        a *=2; // a = a * 2
        a /=2; // a = a / 2
    }
}
