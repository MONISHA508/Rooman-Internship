package com.fb;

import java.io.IOException;
import java.io.PrintWriter;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fbsrv
 */
@WebServlet("/fburl")
public class Fbsrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fbsrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//General settings
				response.setContentType("text/html");
				PrintWriter pw = response.getWriter();
				
				//Request Data gathering logic
				String fname = request.getParameter("firstname");
				String lname = request.getParameter("lastname");
				String uname = request.getParameter("username");
				String pwd = request.getParameter("password");
				
				//Persistence logic
				SessionFactory factory = HibernateUtil.getSessionFactory();
		        Session session = factory.openSession();
		        Transaction tx = session.beginTransaction();
		        
		        //save or insert
		        User u = new User();
		        u.setFname(fname);
		        u.setLname(lname);
		        u.setUname(uname);
		        u.setPassword(pwd);
		        session.persist(u);
		        tx.commit();
		        
		        pw.println("success");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
