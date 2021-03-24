package Lesson_2;

public class HW2 {
    public static void main(String[] args) {
        int arrNew1[] = new int[2];

        for (int i = 0; i < arrNew1.length; i++) {
            arrNew1[i] = i;
            System.out.println(arrNew1[i]);
        }
        System.out.println();

        int arrNew2[] = new int[1000];
        for (int i = 0; i < arrNew2.length; i++) {
            arrNew2[i] = i + 1;
            System.out.println(arrNew2[i]);
        }
        System.out.println();

        int arrNew3[] = new int[20];
        for (int i = 0, j = -20; i < arrNew3.length && j < 20; j++) {
            if (!(j % 2 == 0)) {
                arrNew3[i] = j;
                i++;
            }
        }
        for (int i = 0; i < arrNew3.length; i++) {
            System.out.print(arrNew3[i] + " ");
        }

        System.out.print("\n");

        int[] arrNew4 = {11, 25, 74, 15, -40, 5};
        for (int x = 0; x < arrNew4.length; x++) {
            if (arrNew4[x] % 5 == 0)
                System.out.println(arrNew4[x]);
        }


//        int a[] = new int[20];
//        int j = 0;
//        for (int i = -20; i <= 20; i++) {
//            if (i % 2 != 0) {
//                a[j] = i;
//                j++;
//                System.out.print(i + " ");
//            }
//        }
//
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
    }
}