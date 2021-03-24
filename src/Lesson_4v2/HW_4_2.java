package Lesson_4v2;
import java.util.Scanner;

public class HW_4_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter your age: ");

        int number = input.nextInt();
            if (number < 18) {
                    System.out.println("You are not allowed to enter the club - you are too young");
            } else {
                    System.out.println("Good evening, Sir. Welcome to the club");
        }
    }
}
