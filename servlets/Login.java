package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.movie.dto.MovieDTO;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private MovieDAOImpl moviedao=new MovieDAOImpl();
  

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        System.out.println("Login Credential");
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		MovieDTO moviedto=new MovieDTO();
		moviedto.setUsername(username);
		moviedto.setPassword(password);
		
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
		
			
			if((username.contentEquals("Vedha"))&&(password.contentEquals("123"))){
				
            RequestDispatcher dispatcher=req.getRequestDispatcher("MovieDaOimpl");
            dispatcher.forward(req,resp);
            
        }else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("Error.html");
			dispatcher.forward(req,resp);
        }
		

	}

}
