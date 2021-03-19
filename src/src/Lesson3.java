package src;

public class Lesson3 {
    public static void main(String[] args) {

        int arrNew[] = new int[330];

        for (int i = 0; i <= arrNew.length-1; i++) {
            arrNew[i] = i+1;
        }
        for (int t:arrNew){
            if (arrNew[t]%2==1){
                System.out.println(arrNew[t]);
            }
            if (t == 300){
                break;
            }

        }
        myMethod(arrNew);
    }
    public static void myMethod (int [] r, boolean isOdd) {
        for (int u:r) {
            if (u%2 == 1)
            System.out.println(u);
        }
    }
}
