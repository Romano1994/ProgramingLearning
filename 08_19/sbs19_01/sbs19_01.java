package sbs19_01;

public class sbs19_01 {

	public static void main(String[] args) {

		
		
	}

}
class Normal{
	String name;
	String address;
	Normal(String _name, String _address){
		name = _name;
		address = _address;
	}
	
}

class Period extends Normal{
	int period;
	Period(String name, String address, int _period){
		super(name, address);
		period = _period;
	}
}

/* 1.은행 계좌개설
 * 2 종류 : 2가지
 * 
 * (1) 보통 예금 : 개설 필요 정보 : 이름.지역
(2) 정기 적금 : 개설 필요 정보 : 이름.지역.가입기
 * 
 */
