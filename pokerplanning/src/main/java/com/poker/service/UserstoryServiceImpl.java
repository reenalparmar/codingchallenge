package com.poker.service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.poker.entity.UserStory;
import com.poker.repository.UserstoryDaoRepository;
import com.poker.service.*;

@Component
public class UserstoryServiceImpl implements UserstoryService{
	@Autowired
	private UserstoryDaoRepository dao;

	@Override
	public UserStory addNewUserStory(UserStory usrstory) {
		// TODO Auto-generated method stub
		
		return dao.save(usrstory);
	}
	public List<UserStory> getUserStory() {
		System.out.println("inside getstoryids");
		List<UserStory> userstoryList = dao.findAll();
		List<Integer> ids = userstoryList.stream().map(Entity -> Entity.getId()).collect(Collectors.toList());
		System.out.println(ids);		
		return userstoryList;
	}
	
	public String deleteUserstoryById(int userstoryid) {
		System.out.println("inside deletestoryids:"+userstoryid);

		Optional<UserStory> storyWrap = dao.findById(userstoryid); // - hibernate method
        String votedstatus=storyWrap.get().getVotedstatus();
        System.out.println("votestatus:"+votedstatus);
        if(votedstatus.equalsIgnoreCase("PENDING")) {
        	System.out.println("inside if");
		dao.deleteById(userstoryid);
        }
		return "deleted";
	}
	

}
