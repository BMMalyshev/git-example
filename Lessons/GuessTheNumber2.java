package Lessons;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber2 {
    public static void main(String[] args) {
        var number = new Random().nextInt(3);
        System.out.println("Угадай число от 0 до :");
        var guess = new Scanner(System.in).nextInt();

        String result;
        if (guess == number) {
            result = "Yes";
        }else {
            result = "No, right number was:" + number;
        }

        System.out.println(guess == number ? "Yes" : "No");
    }
}
