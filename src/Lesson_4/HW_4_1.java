package Lesson_4;
import java.util.Scanner;

public class HW_4_1 {
    public static void main (String [] args) {
        int ageDays;
        Scanner input = new Scanner(System.in);
        System.out.print("enter your age: ");
        int number = input.nextInt();
        ageDays = number * 365;
        System.out.println("your age in days is: " + ageDays + " days");
    }
}

