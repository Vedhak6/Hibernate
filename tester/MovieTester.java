package com.xworkz.tester;


import com.xworkz.appu.dao.MovieDAO;
import com.xworkz.appu.dao.MovieDAOImpl;
import com.xworkz.appu.dto.MovieDTO;

public class MovieTester {

	public static void main(String[] args) {
		
		MovieDTO moviedto=new MovieDTO();
		
		moviedto.setMovieName("yuvarathna");
	    moviedto.setHero("puneeth");
	    moviedto.setNoOfHours(4);
	    
		MovieDAO daoImpl = new MovieDAOImpl();
		daoImpl.saveMovie(moviedto);
	    daoImpl.fetchMovie(101);
	    
	   
	    daoImpl.updateMovie(moviedto, 102);
	    
	}

}
