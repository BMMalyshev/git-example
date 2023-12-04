package Lessons;

import java.math.BigInteger;

public class IntOverflow {
    public static void main(String[] args) {
        {
            var i = Integer.MAX_VALUE;
            System.out.println(i);
            System.out.println(i + 1);
        }
        {
            var i = Integer.MIN_VALUE;
            System.out.println(i);
            System.out.println(i - 1);
        }
        System.out.println(1);
        System.out.println(1 * 2);
        System.out.println(1 * 2 * 4);
        System.out.println(1 * 2 * 4 * 8);
        System.out.println(1 * 2 * 4 * 8 * 16);
        System.out.println(1 * 2 * 4 * 8 * 32);
        System.out.println(1 * 2 * 4 * 8 * 32 * 64);
        System.out.println(1 * 2 * 4 * 8 * 32 * 64 * 128 * 1024 + 8);

        BigInteger b = new BigInteger("0912850436703426734068374608937468934");
        System.out.println(b);
    }
}
