package com.hindhu.religion.GaneshYouthCommunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hindhu.religion.GaneshYouthCommunity.entity.UserSignIn;

@Repository
public interface UserSignInRepo extends JpaRepository<UserSignIn,Short>{
	
	UserSignIn findByUsername(String username);


}
