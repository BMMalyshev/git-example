package Lessons;

public class Tern {
    public static void main(String[] args) {
       var a = 6;

       if (a == 5) {
           System.out.println("a == 5");
       } else {
           System.out.println("a != 5");
       }

        System.out.println(a == 5 ? "a == 5" : "a !=5");
    }
}
