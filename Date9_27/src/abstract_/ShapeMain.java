package abstract_;

import java.util.Scanner;
class SadariTest extends ShapeTest{
	int top, bottom, height;

	public SadariTest() {
		System.out.println("SadariTest 기본 생성");
		System.out.print("밑변 : ");
		bottom = scan.nextInt();
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area = (top + bottom) * height / 2;
	}
	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 : " + area);
		System.out.println();
	}
}
class SaTest extends ShapeTest{
	int width;
	int height;
	
	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.print("가로 : ");
		width = scan.nextInt();
		System.out.print("세로 : ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area = width * height;
	}
	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 : " + area);
		System.out.println();
	}
}
class SamTest extends ShapeTest{
	protected int base, height;
	
	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area = base * height/2.0;
	}
	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 : " + area);
		System.out.println();
	}
}
abstract class ShapeTest {
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	
	public ShapeTest() {
		System.out.println("ShapeTest 기본 생성자");
	}
	public abstract void calcArea();
	public abstract void dispArea(); 
}
public class ShapeMain {
	
	public static void main(String[] args) {
		
		ShapeTest shape = null;
		shape = new SamTest();
		shape.calcArea();
		shape.dispArea();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		
	}
}