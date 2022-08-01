public class sbs01_2 {
    public static void main(String[] args) {
        int month = 5;
        month <= 12;

        switch (month) {
            case 2:
            System.out.println(28);
            break;
            
            case 4: case 6: case 9: case 11:
            System.out.println(30);
            break;           

            default: 
            System.out.println(31);
        }

    }
}
