package Lesson_4;
import java.util.Scanner;

public class HW_4_3 {
    public static void main (String [] args){

        int dayNumber [] = {1, 2, 3, 4, 5, 6, 7};
        String name[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any number of day: ");
        int number = input.nextInt();
            for (int i = 0; i < dayNumber.length; i++ ) {
                if (number == dayNumber[i])
                    System.out.println("The day " + dayNumber[i] + " is " + name[i]);
            }
        System.out.println("You entered wrong day number");
    }
}
