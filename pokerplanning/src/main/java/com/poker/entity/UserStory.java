package com.poker.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "userstory")
public class UserStory {

	private int Id;
	
	private int userstoryid;
	
	private String description;
	
	private String votedstatus;
	
	private int sessionid;
	

	public UserStory(){
		
	}
	
	public UserStory(int id,int storyId ,String description,String votedstatus,int sessionid) {
		super();
		this.Id=id;
		this.userstoryid=storyId;
		this.description=description;
		this.votedstatus=votedstatus;
		this.sessionid=sessionid;
	}
	
	 @Id   
	    @GeneratedValue(strategy= GenerationType.AUTO,generator="native"  )
	    @GenericGenerator(name = "native", strategy = "native"  ) // u need it only for MYSQL else you get error Hibernate-sequence not found 
	        public int getId() {
	        return Id;
	    }
	    public void setId(int id) {
	        this.Id = id;
	    }
	 

	  
   
    @Column(name="userstoryid",nullable=false)
     public int getUserstoryid() {
		return userstoryid;
	}

	public void setUserstoryid(int userstoryid) {
		this.userstoryid = userstoryid;
	}
    
	@Column(name="description",nullable =false)
    public String getdescription() {
    	return description;
    }
    
    public void setdescription(String description) {
    	this.description=description;
    }
    
  
	@Column(name="votedstatus",nullable =false)
    public String getVotedstatus() {
		return votedstatus;
	}

	public void setVotedstatus(String votedstatus) {
		this.votedstatus = votedstatus;
	}
	@Column(name="sessionid",nullable =false)
	public int getSessionid() {
		return sessionid;
	}

	public void setSessionid(int sessionid) {
		this.sessionid = sessionid;
	}
	
	@Override
	public String toString() {
		return "UserStory [Id=" + Id + ", userstoryid=" + userstoryid + ", description=" + description
				+ ", votedstatus=" + votedstatus + ", sessionid=" + sessionid + "]";
	}

	
	
}
