package Lesson_4v2;
import java.util.Scanner;

public class HW_4_4 {
    public static void main(String[] args) {

        int dayNumber4[] = {1, 2, 3, 4, 5, 6, 7};
        String name4[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.print("Please enter any number of day: ");
            Scanner input = new Scanner(System.in);
                int number = input.nextInt();

                int i =0;
        do {
            System.out.println(name4[i]);
            i++;
        }
        while (i < number);
//
//        for (int i = 0; i < dayNumber4.length; i++) {
//            if (number == dayNumber4[i]) {
//                System.out.println(name4[i]);
//            }
//            if (i == number) {
//                break;
//            }
        }
    }