package com.xworkz.movie.dao;

import java.util.Objects;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.xworkz.movie.dto.MovieDTO;

import com.xworkz.singleconnection.SingleSessionFactory;

public class MovieDAOImpl  {

	
	public void savemovie(MovieDTO moviedto) throws ClassNotFoundException {
		System.out.println("Invoke savemovie");
		Session session=null;

		try{

			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session =sessionFactory.openSession();
			session.beginTransaction();
			session.save(moviedto);
			session.getTransaction().commit();
			System.out.println("Save MovieDTO");
			SingleSessionFactory.closeSingleFactory();

		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if(Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			}else {
				System.out.println("Session is not closed");
			}
		}
	}

	
	

	
}