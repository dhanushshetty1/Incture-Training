package com.incture.hibernate.BiOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	
	@Id
	private int Acc_id;
	private String Acc_type;
	@OneToOne
	private Student student;
	public int getAcc_id() {
		return Acc_id;
	}
	public void setAcc_id(int acc_id) {
		Acc_id = acc_id;
	}
	public String getAcc_type() {
		return Acc_type;
	}
	public void setAcc_type(String acc_type) {
		Acc_type = acc_type;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Account [Acc_id=" + Acc_id + ", Acc_type=" + Acc_type + ", student=" + student + "]";
	}
	

}