package rrr;

public class Lesson2 {
    public static void main(String[] args) {

        int age[] = {30, 33, 36, 44, 27};

//        int age[];
//        age = new int[5];
//        age[0] = 30;
//        age[1] = 33;
//        age[2] = 36;
//        age[3] = 44;
//        age[4] = 27;

        String name[] = {"A", "B", "C", "D", "E"};

        for (int i = 0; i < 5; i++) {
            if (age[i]%2==0)
                System.out.println(name[i]);
        }

//        int x = 0;
//        while (x < 5) {
//            if (age[x]%2==0)
//                System.out.println(name[x]);
//            x++;
//        }


//        System.out.println(age[0]%2==0?name[0]:"");
//        System.out.println(age[1]%2==0?name[1]:"");
//        System.out.println(age[2]%2==0?name[2]:"");
//        System.out.println(age[3]%2==0?name[3]:"");
//        System.out.println(age[4]%2==0?name[4]:"");

    }
}

