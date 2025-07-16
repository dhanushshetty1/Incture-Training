package com.incture.hibernate.BiOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	
		
		@Id
		private int id;
		private String name;
		private String city;
		
		@OneToOne
		private Account account;

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

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public Account getAccount() {
			return account;
		}

		public void setAccount(Account account) {
			this.account = account;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", city=" + city + ", account=" + account + "]";
		}
		

	

}
