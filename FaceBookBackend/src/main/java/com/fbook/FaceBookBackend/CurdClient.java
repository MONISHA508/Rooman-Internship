package com.fbook.FaceBookBackend;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CurdClient {

	public static void main(String[] args) {
		 SessionFactory factory = HibernateUtil.getSessionFactory();
	        Session ses = factory.openSession();
	        Transaction tx = ses.beginTransaction();
	        
	        //insert
	        Product p = new Product();
	        p.setFname("Monisha");
	        p.setLname("B");
	        p.setGender("Female");
	        p.setMnum("9014584725");
	        p.setUserName("moni508");
	        p.setPassword("password1");
	        p.setDob(Date.valueOf("2004-04-03"));
	        ses.save(p);
	        tx.commit();
	        
	        /*Product p1 = new Product();
	        p1.setFname("Monisha2");
	        p1.setLname("B");
	        p1.setGender("Female");
	        p1.setMnum("9014584725");
	        p1.setUserName("Monisha2");
	        p1.setPassword("password");
	        p1.setDob(Date.valueOf("2004-04-03"));
	        ses.save(p1);
	        tx.commit();*/
	       /* //update
	        Product p = new Product();
	        p.setPid(2);
	        p.setPname("RealMe_Pro");
	        p.setPrice(35000);
	        ses.update(p);
	        tx.commit();*/
	        
	       /* //delete
	        Product p = new Product();
	        p.setPid(2);
	        ses.remove(p);
	        tx.commit();*/
	        
	        //get
	        /*Product p = ses.load(Product.class, 1);
	        System.out.println(p.getPid() +" " +p.getPname() +" "+p.getPrice());*/
	}

}
