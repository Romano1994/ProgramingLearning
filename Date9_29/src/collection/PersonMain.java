package collection;

import java.util.ArrayList;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("죠르디" ,30);
		
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
//		System.out.print("이름 = " + aa.getName() + "   ");
//		System.out.println("나이 = " + aa.getAge());
//		System.out.print("이름 = " + bb.getName() + "   ");
//		System.out.println("나이 = " + bb.getAge());
//		System.out.print("이름 = " + cc.getName() + "   ");
//		System.out.println("나이 = " + cc.getAge());
		
	}
	
	public static void main(String[] args) {
		PersonMain personMain = new PersonMain();
		
		ArrayList<PersonDTO> list = personMain.init();
		
		for(PersonDTO dto : list) {
			System.out.println(dto.toString());
			
		}

//		for(int i=0; i<personMain.init().size(); i++) {
//			System.out.print("이름 = ");
//			System.out.print(list.get(i).getName() + "  ");
//			System.out.print("나이 = ");
//			System.out.println(list.get(i).getAge());
//			
//		}
	}
}
