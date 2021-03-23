package Lesson_5;

public class Person {
    String name;
    boolean isMale;
    private int age;

    public void setAge (int age){
        if (age < 0 || age > 126){
            System.out.println("invalid age");
            return;
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
