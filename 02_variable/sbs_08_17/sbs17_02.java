public class sbs17_02 {
    public static void main(String[] args) {
        Person a1 = new Person();
        Student a2 = new Student();
    }
}

class Person{
    String name;
    int age;
}

class Student extends Person{
    int score;
    String grade;
}