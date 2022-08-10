/**
 * ch6_21
 */
public class ch6_21 {

    static int abs(int value){
        return value < 0 ? -value : value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 " + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 " + abs(value));
    }

    // static int abs(int value){
    //     int result = Math.abs(value);
    //     return result;
    // }

}