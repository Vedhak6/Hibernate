package com.xworkz.movie.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class MovieDTO implements java.io.Serializable{
	
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="UID")
	private int uid;
    
    @Column(name="USERNAME")
	private String username;
    
    @Column(name="PASSWORD")
	private String password;
    
  
	public MovieDTO( ) {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}
	
	
	public MovieDTO(int uid, String username, String password) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		String formattedData=String.format("%-8s%-8s%s",uid,username,password);
		return formattedData;
	}
	
	
	

}
