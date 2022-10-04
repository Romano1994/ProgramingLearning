package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.w3c.dom.ls.LSOutput;

public class ObjectMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PersinDTO persinDTO = new PersinDTO("홍길동", 25, 182.5);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(persinDTO);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2"));
		PersinDTO dto = (PersinDTO) ois.readObject();
		System.out.println("이름 = " + dto.getName());
		System.out.println("나이 = " + dto.getAge());
		System.out.println("키 = " + dto.getHeight());
		ois.close();
	}
}
