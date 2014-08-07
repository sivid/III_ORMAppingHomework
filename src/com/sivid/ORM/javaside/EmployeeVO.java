/* some problems with obdate, i'm not sure where to do the type conversion
 * 
 */

package com.sivid.ORM.javaside;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeVO {
	private String name;
	private String gender;
	private Date obdate;
	private String phone;
	private String address;
	private int salary;
	
	public EmployeeVO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getObdate() {
		return obdate;
	}

	public void setObdate(Date obdate) {
		this.obdate = obdate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
