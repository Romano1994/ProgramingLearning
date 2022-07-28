public class ch4_21 {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= j; i++ ){
                System.out.print("*");
                continue;
            }
            System.out.println("-----------");
        }
    }
}
