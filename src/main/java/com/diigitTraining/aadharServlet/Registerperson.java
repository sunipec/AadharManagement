package com.diigitTraining.aadharServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.diigitTraining.aadharInfo.HibernateManager;
import com.diigitTraining.aadharInfo.addharInfo;
@WebServlet("/register")
public class Registerperson extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    addharInfo ad = new addharInfo();
	    ad.setId(Integer.parseInt(req.getParameter("id")));
	    ad.setName(req.getParameter("name"));
	    ad.setEmail(req.getParameter("email"));
	    ad.setGender(req.getParameter("gender"));
	    ad.setAddress(req.getParameter("address"));
	    ad.setPin(Integer.parseInt(req.getParameter("pin")));
	    ad.setPhonenumber(Integer.parseInt(req.getParameter("phonenumber")));
	    HibernateManager hbm = new HibernateManager();
	  boolean x = hbm.saveObj(ad);
	  if(x==true) {
		  resp.sendRedirect("registerSuccess.html");
	  }
	  else {
		  resp.sendRedirect("registerFailed.html");
	  }
	    
	}
	

}
