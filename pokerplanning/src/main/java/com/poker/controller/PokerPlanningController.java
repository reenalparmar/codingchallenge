package com.poker.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.poker.entity.PokerPlanningSession;
import com.poker.entity.UserStory;
import com.poker.service.Pokerplanningservice;
import com.poker.service.UserstoryService;
@RestController
@RequestMapping("/api/v1")
public class PokerPlanningController<HttpSession> {
	
	
	
 @Autowired
  UserstoryService userstoryservice;
 
 @Autowired 
 Pokerplanningservice pokerplanningservice;
 
 
 
 	@PostMapping("/createpokerplanningsession")
 	public PokerPlanningSession createpokerplanningsession(@RequestParam String title,@RequestParam String deckType) {
		
		
		PokerPlanningSession poker=new PokerPlanningSession();
		poker.setDeckType(deckType);
		poker.setTitle(title);
		
 		return pokerplanningservice.createpokerplanningsession(poker);
 	}
 	
 	
 	
 	
 	
 	@DeleteMapping("/deletepokerplanningsession") 
	public ResponseEntity<String> deletepokerplanningsession(@RequestParam int sessionid)
		 {
		
 			pokerplanningservice.deletePokerSessionById(sessionid);
		return ResponseEntity.ok("deleted record of :" + sessionid);
	}

	
	@GetMapping("/getuserstories")
	public List<UserStory> getAllUserstories() {
		System.out.println("inside controller");
		return userstoryservice.getUserStory();
	}
	
	@PostMapping("/adduserstory")
	public UserStory addUserStory(@RequestBody UserStory userstory) {
		System.out.println("User story add :");
		return userstoryservice.addNewUserStory(userstory);
	}
	
	@DeleteMapping("deleteuserstory/{userstoryid}") 
	public ResponseEntity<String> deleteuserstory(@PathVariable(value = "userstoryid") int userstoryid)
		 {
		userstoryservice.deleteUserstoryById(userstoryid);
		return ResponseEntity.ok("deleted record of :" + userstoryid);
	}

}
