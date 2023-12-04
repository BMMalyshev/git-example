package Lessons;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Year: ");
        var year = new Scanner(System.in).nextInt();

        Boolean High;
        var temp1 = year % 400;
        var temp2 = year % 100;
        var temp3 = year % 4;

         if (temp1 == 0) {
             High = true;
         } else if (temp2 == 0) {
             High = false;
         } else if (temp3 == 0) {
             High = true;
         } else {
             High = false;
         }
        System.out.println(High == true ? "Високосный" : "Обычный");

    }
}
