package Lesson_4;
import java.util.Scanner;

public class HW_4_3 {
    public static void main(String[] args) {

        int dayNumber[] = {1, 2, 3, 4, 5, 6, 7};
        String name[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
            System.out.print("Please enter any number of day: ");
                int number = input.nextInt();
                int i = 0;

                switch (number){
                    case 1:
                        System.out.println("The day is Monday");
                        break;
                    case 2:
                        System.out.println("The day is Tuesday");
                        break;
                    case 3:
                        System.out.println("The day is Wednesday");
                        break;
                    case 4:
                        System.out.println("The day is Thursday");
                        break;
                    case 5:
                        System.out.println("The day is Friday");
                        break;
                    case 6:
                        System.out.println("The day is Saturday");
                        break;
                    case 7:
                        System.out.println("The day is Sunday");
                        break;
                    default:
                        System.out.println("Not valid day");
                }
        }
}
