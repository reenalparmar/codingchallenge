package com.poker.service;

import java.util.List;

import com.poker.entity.UserStory;

public interface UserstoryService {
	  public UserStory addNewUserStory(UserStory usrsty) ;
		public List<UserStory> getUserStory();		
	    public String  deleteUserstoryById(int userstoryid) ;	

}
