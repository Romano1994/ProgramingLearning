package lecture;

/**
 * sbs11_01
 */
public class sbs11_01 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = d1;
        d1.score = 80;
        d2.score = 100;

        System.out.println(d1.score);
        System.out.println(d2.score);
    }
}
class Dog{
    int score =80;
}
