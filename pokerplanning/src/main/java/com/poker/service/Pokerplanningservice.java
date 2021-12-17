package com.poker.service;

import java.util.List;

import com.poker.entity.PokerPlanningSession;
import com.poker.entity.UserStory;

public interface Pokerplanningservice {

	public PokerPlanningSession  createpokerplanningsession(PokerPlanningSession poker);
		
	public void deletePokerSessionById(int sessionid);
	

}
