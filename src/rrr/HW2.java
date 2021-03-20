package rrr;

public class HW2 {
    public static void main(String[] args) {
        int arrNew1[] = new int[2];

        arrNew1[0] = 30;
        arrNew1[1] = 33;

         int arrNew2[] = new int[1000];
            for (int i = 0; i <= arrNew2.length - 1; i++) {
            arrNew2[i] = i + 1;
        }

        int arrNew3[] = new int[40];
            for (int i = -20; i <= 20; i++) {
                if (arrNew3[i] % 2 != 0) {
                    System.out.println(arrNew3[i]);
                }

            }

            int[] arrNew4 = {11, 25, 74, 15, -40, 5};
            for (int x = 0; x < arrNew4.length; x++) {
                if (arrNew4[x] % 5 == 0)
                    System.out.println(arrNew4[x]);
            }
        }
    }