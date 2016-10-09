package cn.mldn.vo;

import java.io.Serializable;
import java.sql.Date;

import oracle.net.aso.p;

public class Mem implements Serializable {
	private String mid;
	private String name;
	private String sex;
	private String edu;
	private Date birthday;
	private Double salary;
	private String note;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Mem [mid=" + mid + ", name=" + name + ", sex=" + sex + ", edu=" + edu + ", birthday=" + birthday
				+ ", salary=" + salary + ", note=" + note + "]";
	}

}
