package com.xworkz.tester;


import java.util.Scanner;

import com.xworkz.appu.dao.MovieDAO;
import com.xworkz.appu.dao.MovieDAOImpl;
import com.xworkz.appu.dto.MovieDTO;

public class MovieTester {

	public static void main(String[] args) {
		
		System.out.println("1--->Save");
		System.out.println("2--->fetch");
		System.out.println("3--->update");
		System.out.println("4--->delete");
		
		MovieDTO moviedto=new MovieDTO();
		MovieDAO daoImpl = new MovieDAOImpl();
		
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		switch(choice) {
		
		case 1:daoImpl.saveMovie(moviedto);
		       break;
		case 2: daoImpl.fetchMovie(101);
		       break;
		case 3:daoImpl.updateMovie(moviedto, 102);
		       break;
		case 4:daoImpl.removeMovie(102);
		       break;
		default : System.out.println();       
		}
		
//		MovieDTO moviedto=new MovieDTO();
//
//		moviedto.setMovieName("yuvarathna");
//	    moviedto.setHero("puneeth");
//	    moviedto.setNoOfHours(4);
//	    
//		MovieDAO daoImpl = new MovieDAOImpl();
//		daoImpl.saveMovie(moviedto);
//	    daoImpl.fetchMovie(101);
//	    daoImpl.updateMovie(moviedto, 102);
//	    daoImpl.removeMovie(102);
	}

}
