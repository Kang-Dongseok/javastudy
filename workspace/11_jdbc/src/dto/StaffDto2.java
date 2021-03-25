package dto;

import java.sql.Date;

// 복습용 다시 만들기
public class StaffDto2 {


	// field
	private int no;
	private String name;
	private String department;
	private Date hireDate;
	
	//constructor
	public StaffDto2() {}
	public StaffDto2(int no, String name, String department, Date hireDate) {
		super();
		this.no = no;
		this.name = name;
		this.department = department;
		this.hireDate = hireDate;
	}
	
	// method
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "StaffDto2 [no=" + no + ", name=" + name + ", department=" + department + ", hireDate=" + hireDate + "]";
	}
	
}
