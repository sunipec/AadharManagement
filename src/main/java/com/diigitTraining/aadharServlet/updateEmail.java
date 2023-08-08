package com.diigitTraining.aadharServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.diigitTraining.aadharInfo.HibernateManager;
@WebServlet("/updateEmail")
public class updateEmail extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String s = req.getParameter("email");
		int id = Integer.parseInt(req.getParameter("id"));
		HibernateManager hbm = new HibernateManager();
		hbm.update(id, s);
		
	}

}
