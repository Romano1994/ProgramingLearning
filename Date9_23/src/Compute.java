
public class Compute {
	private int x,y,sum,sub,mul;
    private double div;
    
    void setX(int x){
    	this.x = x;
    }
    void setY(int y) {
    	this.y = y;
    }
    void calc() {
    	sum = x + y;
    	sub = x - y;
    	mul = x * y;
    	div = (double)x / y;
    }
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;
	}
	public int getMul() {
		return mul;
	}
	public String getDiv() {
		return String.format("%.2f", div);
	}
    
}
