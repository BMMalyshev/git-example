package Lessons;

import java.util.Scanner;

public class WeekDay2 {
    public static void main(String[] args) {
        System.out.println("Enter day of a week:");
        var input = new Scanner(System.in).nextInt();

        switch (input) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
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


    }
}