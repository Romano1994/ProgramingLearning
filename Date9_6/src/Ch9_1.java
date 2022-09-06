
public class Ch9_1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("같습니다 ");
		}else {
			System.out.println("다릅니다 ");
		}
		
		
	}

}
class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
}