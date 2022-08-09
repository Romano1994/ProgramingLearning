class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    double getDistance(int x, int y){

        return Math.sqrt((x -x) * ( x - x) + (y - y) * (y - y));
        
    }
}

/**
 * ch6_pr06
 */
public class ch6_pr06 {

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2, 2));

    }
}