package com.xworkz.punith.dao;


import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.punith.dto.PunithDTO;
import com.xworkz.singleconnection.SingleSessionFactory;
	

public  class PunithDAOImpl implements PunithDAO{

	@Override
	public void savePunith(PunithDTO punithdto) {
		System.out.println("Invoke savePunithdto");
		Session session=null;

		try{

			SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session =sessionFactory.openSession();
			session.beginTransaction();
			session.save(punithdto);
			session.getTransaction().commit();
			System.out.println("Save PunithDTO");
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

	

