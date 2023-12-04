package Lessons;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
       // Получение данных
        System.out.println("Введите число:");
        var a = new Scanner(System.in).nextDouble();

        System.out.println("Оператор:");
        var ch = new Scanner(System.in).nextLine().charAt(0);

        System.out.println("Введите второе число:");
        var b = new Scanner(System.in).nextDouble();

        // Обработка данных
        var result = String.valueOf(a) + String.valueOf(ch) + String.valueOf(b);

        // Вывод результата
        System.out.println("Результат: \n");
        System.out.println(result);

        /*{
            var a = 5;
            var b = 3;

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        }
        {
            var a = 5.;
            var b = 3;

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        }*/
    }
}
