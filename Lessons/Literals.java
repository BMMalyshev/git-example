package Lessons;

public class Literals {
    public static void main(String[] args) {
        String is = String.valueOf(1);
        String ds = String.valueOf(1.1);
        String bs = String.valueOf(true);
        String cs = String.valueOf('a');

        System.out.println("Hello " + 1 + 1.1 + true + 'a');

        int si = Integer.parseInt("12");
        double sd = Double.parseDouble("1.2");
        boolean sb = Boolean.parseBoolean("true");
        char ch1 = "a".charAt(0);
        char ch2 = "abs".charAt(2);
        System.out.println(ch2);

        char ch = 2;
        int i = 4;
        double d = 8;

        d = i;
        d = ch;
        i = (int) d;
        ch = (char) d;
        ch = (char) i;

        boolean b = true;
       /* // int
        var i = 1;
        // double
        var d1 = 1.0;
        var d2 = 1.;
        var d3 = 1.23456;
        var d4 = 5e3;
        // boolean
        var b = true;
        // char
        var c1 = 'a';
        var c2 = '\t';
        var c3 = '\n';
        // String
        var s = "Alexey";*/
    }
}
