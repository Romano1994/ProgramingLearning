package guestbook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import guestbook.bean.GuestbookDTO;


public class GuestbookDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:5151:xe";
	private String userName = "c##java";
	private String password = "bit";
	
	// 다른 클래스, 패키지에서 서버를 연결하기 위해 DAO 객체를 생성할 수 있게 static 메서드 정의
	private static GuestbookDAO guestbookDAO = new GuestbookDAO();
	public static GuestbookDAO getInstance() {
		return guestbookDAO;
	}//getInstance()
	
	//드라이버 연결
	public GuestbookDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} //GuestbookDAO()
	
	// DB연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//getConnection()
	
	
	
	/**
	 * @param guestbookDTO  작성된 게시물 정보의 DTO 객체
	 * @return int  DB에 insert된 레코드의 수
	 * 클라이언트에 작성된 게시물 데이터를 오라클DB에 저장
	 */
	public int guestbookWrite(GuestbookDTO guestbookDTO) {
		getConnection(); //서버 연결
		int su = 0;	//insert된 레코드의 수를 저장할 변수 지정
		// 사용할 SQL 쿼리문
		String guestbookWriteSql = "insert into guestbook values(seq_guestbook.nextval,?,?,?,?,?,sysdate)";
		
		try {
			// 쿼리문 실행
			pstmt = conn.prepareStatement(guestbookWriteSql);
			pstmt.setString(1, guestbookDTO.getName());
			pstmt.setString(2, guestbookDTO.getEmail());
			pstmt.setString(3, guestbookDTO.getHomepage());
			pstmt.setString(4, guestbookDTO.getSubject());
			pstmt.setString(5, guestbookDTO.getContent());
			
			//성공한 레코드의 수 저장
			su = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//성공한 레코드의 수 반환
		return su;
	}//guestbookWrite
	
	
	/**
	 * @return ArrayList<GuestbookDTO> 저장된 데이터들을 DTO 객체들에 저장하고 이를 Arraylist로 반환
	 */
	public ArrayList<GuestbookDTO> guestbookList() {
		getConnection(); //서버 연결
		// 사용할 쿼리문
		String guestbookListSql = "select * from guestbook order by seq desc";
		// DTO객체들 저장에 사용할 Arraylist
		ArrayList<GuestbookDTO> list = new ArrayList<GuestbookDTO>();
		// 출력할 날짜 형식
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			//쿼리문 실행
			pstmt=conn.prepareStatement(guestbookListSql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//DTO 객체 생성
				GuestbookDTO guestbookDTO = new GuestbookDTO();
				
				//DB에 저장된 데이터들 DTO에 저장
				String name = rs.getString("name");
				String email = rs.getString("email");
				String homepage = rs.getString("homepage");
				String subject = rs.getString("subject");
				String content = rs.getString("content");
				
				guestbookDTO.setName(name);
				guestbookDTO.setEmail(email);
				guestbookDTO.setHomepage(homepage);
				guestbookDTO.setSubject(subject);
				guestbookDTO.setContent(content);
				guestbookDTO.setLogtime(dateFormat.format(rs.getDate("logtime")));
				
				// 데이터가 저장된 DTO를 Arraylist에 추가
				list.add(guestbookDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
