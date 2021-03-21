package Shild_lessons;

public class GalToLitTaЬle {
    public static void main(String args[]){
//        double gallons, liters;
//        int counter = 0;
//        for (gallons = 1; gallons <= 100; gallons++){
//            liters = gallons * 3.7854;
//            System.out.println(gallons + " галлону(ам) соответствует " +
//                    liters + " литров");
//            counter++;
//            if (counter == 10) {
//                System.out.println();
//                counter = 0;
//            }
//        }
        double inch, meters;
        int counter1 = 0;
        for (inch = 1; inch <= 108; inch++){
            meters = inch / 39.3701;
            System.out.println(inch + " дюйму(ам) соответствует " +
                    meters + " метров");
            counter1++;
            if (counter1 == 12) {
                System.out.println();
                counter1 = 0;
            }
        }
//        double moon_gravity;
//        double ves = 70;
//        moon_gravity = ((ves / 100) * 17);
//        System.out.println("мой вес на луне = " + moon_gravity);
    }
}
