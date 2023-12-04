package Lessons;

public class SwapVariables {
    public static void main(String[] args) {
       // Input data
        var a = 5;
        var b = 1;

        // Processing data
        var c = a;
        a = b;
        b = c;

        // Output data
        System.out.println(a);
        System.out.println(b);
    }
}
