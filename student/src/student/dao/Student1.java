package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student1 {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:5151:xe";
	private String userName = "c##java";
	private String password = "bit";
	
	public Student1() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} // Student1()
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//getConnection()

	public void menu() {
		Scanner scan = new Scanner(System.in);

		int num;
		
		while(true) {
			System.out.println("**************");
			System.out.println("관리");
			System.out.println("**************");
			System.out.println("1.입력");
			System.out.println("2.검색");
			System.out.println("3.삭제");
			System.out.println("4.종료");
			System.out.println("**************");
			num = scan.nextInt();
			
			if(num == 4) break;
			if(num == 1) insertArticle();
			else if(num == 2) selectArticle();
			else if(num == 3) deleteArticle();
			}//while
	}//menu()
	
	public void deleteArticle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름 입력 : ");
		String name = scan.next();
		
		//DB -delete
		getConnection();
		String sql = "delete student where name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			int su = pstmt.executeUpdate();
			
			System.out.println(su + "개의 행이 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//deleteArticle()

	public void selectArticle() {
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("**************");
			System.out.println("1.이름 검색");
			System.out.println("2.전체 검색");
			System.out.println("3.이전 메뉴");
			System.out.println("**************");
			System.out.print("번호 입력 : ");
			int num = scan .nextInt();
			
			if(num == 3) break;
			
			String name = "";
			if(num == 1) {
				System.out.println("검색할 이름 입력 : ");
				name = scan.next();
				
			}
			
			//DB - select
			getConnection();
			String sql = "";
			if(num == 1) {
				sql = "select * from student where name like ?";
			}else {
				sql = "select * from student";
			}
			
			try {
				pstmt = conn.prepareStatement(sql);
				if(num == 1) pstmt.setString(1, "%"+name+"%");;
				
				rs = pstmt.executeQuery(); // ResultSet 리턴
				
				while(rs.next()) {
					System.out.print("이름 : ");
					System.out.print(rs.getString("name") + "\t");
					if(rs.getInt("code") == 1) System.out.println("학번 : " + rs.getString("value"));
					else if(rs.getInt("code") == 2) System.out.println("과목 : " + rs.getString("value"));
					else if(rs.getInt("code") == 3) System.out.println("부서 : " + rs.getString("value"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}//selectArticle()

	public void insertArticle() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("**************");
			System.out.println("1.학생");
			System.out.println("2.교수");
			System.out.println("3.관리자");
			System.out.println("4.이전메뉴");
			System.out.println("**************");
			num = scan.nextInt();
			
			if(num == 4) break;
			
			System.out.print("이름 입력 : ");
			String name = scan.next();
			String value = "";
			if(num == 1) {
				System.out.print("학번 입력 : ");
				value = scan.next();
				
			}else if(num == 2) {
				System.out.print("학번 입력 : ");
				value = scan.next();
				
			}else if(num == 3) {
				System.out.print("학번 입력 : ");
				value = scan.next();
				
			}
			
			//DB - insert
			getConnection();
			String sql = "insert into student values(?,?,?)";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, value);
				pstmt.setInt(3, num);
				
				int su = pstmt.executeUpdate();
				System.out.println("입력이 완료되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // while
	} //insertArticle()
	
	public static void main(String[] args) {
		Student1 student1 = new Student1();
		student1.menu();
		System.out.println("프로그램을 종료합니다");
	} // main()
}
