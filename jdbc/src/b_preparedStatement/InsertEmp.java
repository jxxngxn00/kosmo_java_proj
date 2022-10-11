package b_preparedStatement;

import java.sql.*;

public class InsertEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// project Properties -> Build Path -> Add External JARs -> oracle 설치 폴더에서 ojdbc6.jar 선택
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.35:1521:xe";
			String user = "scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("디비 연결 성공");
			
			//---입력값
			String bonmyeong = "본명";
			int wolgup = 10000;
			String jikup = "IT";
			
			// 3. SQL 문장
			String sql = "INSERT INTO emp(empno, ename, sal, job) VALUES(5555, ?,?,?)";	// ? : 미완성, 미리 선언함
			
			// 4. SQL 전송 객체 **************
			PreparedStatement stmt = con.prepareStatement(sql);	// 먼저 넣어놓음
			stmt.setString(1, bonmyeong);
			stmt.setInt(2, wolgup);
			stmt.setString(3, jikup);
			
			
			
			// 5. SQL 전송
			/*		- ResultSet executeQuery()		: SELECT
			 * 		- int executeUpdate()	: INSERT / DELETE / UPDATE
			 */
			int result = stmt.executeUpdate(); // sql 넣지 않음 : 이미 sql 연결함
			System.out.println(result + "행을 실행");
			
			// 6. 닫기
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("DB 실패 : " + e);
		}
	}

}