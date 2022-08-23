public class sbs_lecture_02 {
    public static void main(String[] args) {
        // Cloth od1 = new Cloth();
        // Cloth od2 = new Cloth("Red");
        // Cloth od3 = new Cloth("Red", "Large");
        Cloth od4 = new Cloth("red", "large");
    }
}
class Cloth{
   String color;
   String size;
   int amount;

   Cloth(){
       this("Black", "Medium", 1);
   }
   Cloth(String color){
       this(color, "Medium", 1);
   }
   Cloth(String color, String size){
       this(color, size, 1);
   }

   Cloth(String size, int amount){
        this("black", size, amount);
   }

   Cloth(String color, String size, int amount){
       System.out.println(color);
       System.out.println(size);
       System.out.println(amount);
   }
}