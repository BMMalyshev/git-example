package Lessons;

public class LogicalExpressions {
    public static void main(String[] args) {
        var a = true;
        var b = false;
        var c = 2 > 1;
        var d = 2 == 1;

        System.out.println(!b);
        System.out.println(a && b); // операция И
        System.out.println(a || b); // операция ИЛИ
    }
}
