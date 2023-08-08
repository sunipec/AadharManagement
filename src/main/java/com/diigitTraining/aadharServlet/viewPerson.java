package com.diigitTraining.aadharServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.diigitTraining.aadharInfo.HibernateManager;
import com.diigitTraining.aadharInfo.addharInfo;
@WebServlet("/viewPerson")
public class viewPerson extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		addharInfo ad = new addharInfo();
		HttpSession session = req.getSession(true);
		HibernateManager hbm = new HibernateManager();
		ArrayList li = hbm.readAll();
		session.setAttribute("list", li);
		
		
//		session.setAttribute("id", ad.getId());
//		session.setAttribute("name", ad.getName());
//		session.setAttribute("email", ad.getEmail());
//		session.setAttribute("gender", ad.getGender());
//		session.setAttribute("address", ad.getAddress());
//		session.setAttribute("pin", ad.getPin());
//		session.setAttribute("phonenumber", ad.getPhonenumber());
	
		
		resp.sendRedirect("viewAllperson.jsp");
		
		
	}

}
