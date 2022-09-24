
import java.util.Scanner;

public class MemberDTO {

	MemberDTO[] mdArr = new MemberDTO[5];
	private String name;
	private int age;
	private String phoneNum;
	private String adress;

	public String getName() {
		return name;
	}

	public void setName() {
		Scanner scan = new Scanner(System.in);
		this.name = scan.next();
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		Scanner scan = new Scanner(System.in);
		this.age = scan.nextInt();
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum() {
		Scanner scan = new Scanner(System.in);
		this.phoneNum = scan.next();
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress() {
		Scanner scan = new Scanner(System.in);
		this.adress = scan.next();
	}
}
