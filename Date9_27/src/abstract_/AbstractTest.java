package abstract_;

public abstract class AbstractTest { // POJO형식 (Plain Old Java Object) => 아무한태도 상속 받지 않는다
	String name;

	public String getName() { // 메소드의 구현부
		return name;
	}

	public abstract void setName(String name); // 아직 정의되지 않은 추상메서드
	
}
