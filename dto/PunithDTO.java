package com.xworkz.punith.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="punithdto" , schema="movie")
public class PunithDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
  //  @Column(name="ID")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	 @Column    //(name="NAME")
	private String name;
	 @Column    //(name="PLACE")
	private String place;
	
	public PunithDTO() {
		super();
	}
	
	public PunithDTO(String id,String name, String place) {
		super();
	    this.id=id;
		this.name = name;
		this.place = place;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		String formattedData=String.format("%-6s%-8s%s",id,name,place);
				
		return formattedData;
	}
	
	
	
}
