package com.klef.jfsd.exam;

public class Counselor 
{
	
	private int id ;
    private String name; 
    private String department;
    private String contactno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Counselor [id=" + id + ", name=" + name + ", department=" + department + ", contactno=" + contactno
				+ "]";
	}
   

}
