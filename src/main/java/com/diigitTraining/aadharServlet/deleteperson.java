package com.diigitTraining.aadharServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.diigitTraining.aadharInfo.HibernateManager;
@WebServlet("/deleteperson")
public class deleteperson extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HibernateManager hbm = new HibernateManager();
		int id  = Integer.parseInt(req.getParameter("id"));
		hbm.delete(id);
	}

}
