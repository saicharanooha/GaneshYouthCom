package com.hindhu.religion.GaneshYouthCommunity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
public class UserProfile { // DB table which store User Profile
	@Id
	@GeneratedValue // id is genarated by database
	public short id;
	
	public String name;
	public String surname;
	public String place;
	public String pincode;
	public String motherName;
	public String fatherName;
	public long phonenumber;
	public String email;
		
	
	
	
	

}
