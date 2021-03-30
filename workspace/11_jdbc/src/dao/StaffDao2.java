package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.StaffDto2;

// 복습용 다시 만들기
public class StaffDao2 {
	
	// field
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;
	private String sql;
	
	// constructor
	private StaffDao2() {}
	private static StaffDao2 staffDao2 = new StaffDao2();
	public static StaffDao2 getInstance() {
		return staffDao2;
	}
	
	// method
	
	/***** 1. 접속 *****/
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "spring";
		String password = "1111";
		return DriverManager.getConnection(url, user, password);
	}
	
	/***** 2. 접속 해제 *****/
	public void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if(rs!=null) {rs.close();}
			if(ps!=null) {ps.close();}
			if(con!=null) {con.close();}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/***** 3. 가장 최근에 추가된 staff의 no 알아내기*****/
	public int selectMaxNo() {
		int no = 0;
		try {
			con = getConnection();
			sql = "SELECT MAX(no) FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				no = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return no;
	}
	/***** 4. staff 추가하기 *****/
	public int insertStaff(StaffDto2 staffDto2) {
		try {
			con = getConnection();
			sql = "INSERT INTO staff (no, name, department, hireDate) VALUES (?, ?, ?, SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, staffDto2.getNo());
			ps.setString(2, staffDto2.getName());
			ps.setString(3, staffDto2.getDepartment());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;
	}
	/***** 5. staff 수정하기 *****/
	public int updateStaff(StaffDto2 staffDto2) {
		try {
			con = getConnection();
			sql = "UPDATE staff SET name = ?, department = ? WHERE no = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, staffDto2.getName());
			ps.setString(2, staffDto2.getDepartment());
			ps.setInt(3, staffDto2.getNo());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;
	}
	/***** 6. staff 삭제하기 *****/
	public int deleteStaff(StaffDto2 staffDto2) {
		try {
			con = getConnection();
			sql = "DELETE FROM staff WHERE no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, staffDto2.getNo());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;
	}
	/***** 7. staff 조회하기 *****/
	public StaffDto2 selectOneByNo(int no) {
		StaffDto2 staffDto2 = null;
		try {
			con = getConnection();
			sql = "SELECT no, name, department, hireDate FROM staff WHERE no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();
			if(rs.next()) {
				staffDto2 = new StaffDto2();
				staffDto2.setNo(rs.getInt(1));
				staffDto2.setName(rs.getString(2));
				staffDto2.setDepartment(rs.getString(3));
				staffDto2.setHireDate(rs.getDate(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return staffDto2;
	}
	/***** 8. staff 전체조회하기 *****/
	public List<StaffDto2> selectList(){
		List<StaffDto2> staffList = new ArrayList<StaffDto2>();
		try {
			con = getConnection();
			sql = "SELECT no, name, deparment, hireDate FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				StaffDto2 staffDto2 = new StaffDto2();
				staffDto2.setNo(rs.getInt(1)); // rs.getInt("no")
				staffDto2.setName(rs.getString(2)); // rs.getInt("name")
				staffDto2.setDepartment(rs.getString(3)); // rs.getInt("department")
				staffDto2.setHireDate(rs.getDate(4)); // rs.getDate("hireDate")
				staffList.add(staffDto2);
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return staffList;
	}
}
