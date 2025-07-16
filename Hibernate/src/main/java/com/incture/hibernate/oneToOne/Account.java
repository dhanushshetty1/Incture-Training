package com.incture.hibernate.oneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Account {
	@Id
	private int acc_id;
	private String acc_type;
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	@Override
	public String toString() {
		return "Account [acc_id=" + acc_id + ", acc_type=" + acc_type + "]";
	}
	
	
	
	
	
}
