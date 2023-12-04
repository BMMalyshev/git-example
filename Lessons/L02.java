package Lessons;

import java.util.Scanner;

public class L02 {
    public static void main(String[] args) {
        System.out.println("Привет! Как тебя зовут?");
        var name = new Scanner(System.in).nextLine();

        var result = "Пошел нахуй, " + name;
        System.out.println(result);
    }
}