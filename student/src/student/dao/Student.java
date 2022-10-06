package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Student {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:5151:xe";
	private String userName = "c##java";
	private String password = "bit";
	
	Scanner scan = new Scanner(System.in);
	
	public Student() {
		try {
			Class.forName(driver);
			System.out.println("driver loading success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//Student()
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//getConnection()
	
	public void menu() {
		while(true) {
		System.out.println("---------------------------");
		System.out.println("\t관리");
		System.out.println("---------------------------");
		System.out.println("1. 입력");
		System.out.println("2. 검색");
		System.out.println("3. 삭제");
		System.out.println("4. 종료");
		System.out.println("---------------------------");
		System.out.print("번호 선택 : ");
		int menuNum = scan.nextInt();

			if (menuNum == 1) {
				insertArticle();
			} else if(menuNum == 2) {
				selectArticle();
			} else if(menuNum == 3) {
				deleteArticle();
			} else if(menuNum == 4) {
				break;
			}
		}
	} // menu()
	
	public void insertArticle() {
		String name = "";
		String value = "";
		getConnection();
		String sqlStatment = "insert into student values (?,?,?)";
		
		System.out.println("---------------------------");
		System.out.println("1. 학생");
		System.out.println("2. 교수");
		System.out.println("3. 관리자");
		System.out.println("4. 이전메뉴");
		System.out.println("---------------------------");
		System.out.print("번호 선택 : ");
		int menuNum = scan.nextInt();
		
		if(menuNum == 1) {
			System.out.print("이름 입력 : ");
			name = scan.next();
			System.out.print("학번 입력 : ");
			value = scan.next();
			
		} else if(menuNum == 2) {
			System.out.print("이름 입력 : ");
			name = scan.next();
			System.out.print("과목 입력 : ");
			value = scan.next();
			
		} else if(menuNum == 3) {
			System.out.print("이름 입력 : ");
			name = scan.next();
			System.out.print("부서 입력 : ");
			value = scan.next();
			
		} else if(menuNum == 4) {
			return;
		}
		try {
			pstmt = conn.prepareStatement(sqlStatment);
			pstmt.setString(1, name);
			pstmt.setString(2, value);
			pstmt.setInt(3, menuNum);
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
	} //insertArticle()
	
	public void selectArticle() {
		System.out.println("---------------------------");
		System.out.println("1. 이름 검색");
		System.out.println("2. 전체 검색");
		System.out.println("3. 이전 메뉴");
		System.out.println("---------------------------");
		System.out.print("번호 선택 : ");
		int menuNum = scan.nextInt();
		getConnection();
		
		if(menuNum == 1) {
			System.out.print("검색할 이름 입력 : ");
			String searchName= scan.next();
			String sqlStatment = "select * from student where name like ?";
			
			try {
				pstmt = conn.prepareStatement(sqlStatment);
				pstmt.setString(1, "%"+searchName+"%");
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.print(rs.getString("name") + "\t");
					System.out.println(rs.getString("value"));
				}
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if(menuNum == 2) {
			String sqlStatment = "select * from student";
			try {
				pstmt = conn.prepareStatement(sqlStatment);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getString("name") + "\t");
					System.out.println(rs.getString("value"));
				}
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if(menuNum == 3) {
			return;
		}
	} //selectArticle
	
	public void deleteArticle() {
		getConnection();
		System.out.print("삭제를 원하는 이름 입력 : ");
		String deleteName = scan.next();
		String sqlStatment = "delete student where name = ?";
		try {
			pstmt = conn.prepareStatement(sqlStatment);
			pstmt.setString(1, deleteName);
			int su = pstmt.executeUpdate();
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
	} //deleteArticle
	
	public static void main(String[] args) {
		Student student = new Student();
		student.menu();
	}
}
