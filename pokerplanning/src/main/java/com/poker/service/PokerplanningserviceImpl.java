package com.poker.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.Query;
import javax.servlet.http.HttpServlet;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poker.entity.PokerPlanningSession;
import com.poker.entity.UserStory;
import com.poker.repository.PokerplanningDaoRespository;
//import com.poker.repository.UserstoryDaoRepository;
import com.poker.service.*;

@Component
public class PokerplanningserviceImpl  implements Pokerplanningservice{
	@Autowired
	private PokerplanningDaoRespository pokersessiondao;
	@Override
	public PokerPlanningSession createpokerplanningsession(PokerPlanningSession poker) {
	
		return pokersessiondao.save(poker);
		
	}
	@Override
	public void deletePokerSessionById(int sessionid) {
		// TODO Auto-generated method stub
	
		pokersessiondao.deleteById(sessionid);

	
	}
	
	

}
