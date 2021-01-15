package com.xworkz.appu.dao;

import java.util.Objects;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.appu.dto.MovieDTO;
import com.xworkz.singleconnection.SingleSessionFactory;

public class MovieDAOImpl implements MovieDAO {

	@Override
	public void saveMovie(MovieDTO moviedto) {
		System.out.println("Invoke saveMovie");
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

	@Override
	public void fetchMovie(int movieId) {
		System.out.println("Invoke fetchMovie");
		Session session=null;

		try{


			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session =sessionFactory.openSession();

			MovieDTO moviedto=session.get(MovieDTO.class, movieId);
			System.out.println("data is fetched");
			System.out.println(moviedto);
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

	@Override
	public void updateMovie(MovieDTO moviedto,int movieId) {
		System.out.println("Invoke updateMovie");
		Session session=null;

		try{

			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session =sessionFactory.openSession();

			MovieDTO moviedto1=session.get(MovieDTO.class, movieId);

			moviedto1.setMovieName(moviedto.getMovieName());
			moviedto1.setHero(moviedto.getHero());
			moviedto1.setNoOfHours(moviedto.getNoOfHours());

			session.beginTransaction();
			session.update(moviedto1);
			session.getTransaction().commit();
			System.out.println("update moviedto");

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

	@Override
	public void removeMovie(int movieId) {
		System.out.println("invoked removeMovie");
		Session session=null;

		try {

			SessionFactory sessionfactory=SingleSessionFactory.getSingleFactory();
			session=sessionfactory.openSession();
			MovieDTO moviedto=session.get(MovieDTO.class, movieId);

			session.beginTransaction();
			session.delete(moviedto);
			session.getTransaction().commit();

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