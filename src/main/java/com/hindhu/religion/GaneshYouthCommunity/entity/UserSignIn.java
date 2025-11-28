package com.hindhu.religion.GaneshYouthCommunity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSignIn { // DB table which can store login details
	@Id
	public short id;   // id is copied from userprofile db and assigned here
	private  String username;
	private String password;
	

}
