package com.poker.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "pokerplanningsession")
public class PokerPlanningSession {
	
//private int Id;
	
	

	private int sessionid;
	
   

	private String title;
	
	private String deckType;
	



	public PokerPlanningSession(){
			
		}

		
		public PokerPlanningSession(int sessionid, String title, String deckType) {
			super();
			//this.Id = id;
			this.sessionid = sessionid;
			this.title = title;
			this.deckType = deckType;
		}
	
	
	  @Id   
	    @GeneratedValue(strategy= GenerationType.AUTO,generator="native"  )
	    @GenericGenerator(name = "native", strategy = "native"  )
	   @Column(name="sessionid",nullable=false)
	public int getSessionid() {
		return sessionid;
	}

	public void setSessionid(int sessionid) {
		this.sessionid = sessionid;
	}

	
	
	@Column(name="title",nullable=false)
	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "PokerPlanningSession [sessionid=" + sessionid + ", title=" + title + ", deckType="
				+ deckType + "]";
	}


	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name="deck_type",nullable=false)
	public String getDeckType() {
		return deckType;
	}

	public void setDeckType(String deckType) {
		this.deckType = deckType;
	}
	
	
	

}
