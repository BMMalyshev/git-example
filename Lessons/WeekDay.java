package Lessons;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println("Enter day of a week:");
        var input = new Scanner(System.in).nextInt();

        System.out.println("Первый день недели - понедельник?");
        var isMondayFirst = new Scanner(System.in).nextBoolean();

        // processing
        if (isMondayFirst == false) {
            if (input == 1) {
                input = 7;
            } else {
                input = input - 1;
            }
        }

        int day = input;
        /*if (input == 1) {
            day = "Monday";
        } else if (input == 2) {
            day = "Tuesday";
        } else if (input == 3) {
            day = "Wednesday";
        } else if (input == 4) {
            day = "Thursday";
        } else if (input == 5) {
            day = "Friday";
        } else if (input == 6) {
            day = "Saturday";
        } else if (input == 7) {
            day = "Sunday";
        } else {
            day = "Wrong day number: " + input;
        }
        System.out.println(day);*/

        System.out.println(
                day == 1 ? "Monday" :
                    day == 2 ? "Tuesday" :
                        day == 3 ? "Wednesday" :
                                day == 4 ? "Thursday" :
                                        day == 5 ? "Friday" :
                                                day == 6 ? "Saturday" :
                                                        day == 7 ? "Sunday" :
                                                                "Invalid day");
    }
}