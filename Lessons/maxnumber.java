package Lessons;

import java.util.Scanner;

public class maxnumber {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();


       var c = a >= b ? a : b;

        System.out.println(c);
    }
}
