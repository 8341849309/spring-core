package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CBScoreMgmtServiceImpl;
import com.nt.service.ICBScoreMgmtService;

@WebServlet(value = "/controller", loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet {

	private ApplicationContext ctx;

	@Override
	public void init() throws ServletException {
		// create container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int mid = Integer.parseInt(req.getParameter("mid"));

		ICBScoreMgmtService ser = ctx.getBean("ser",ICBScoreMgmtService.class);
		String score = ser.findScore(mid);

		// keep result in request scope
		req.setAttribute("scoreBoard", score);
		// forward to show_score.jsp page
		RequestDispatcher rd = req.getRequestDispatcher("/show_score.jsp");
		rd.forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

	@Override
	public void destroy() {
		((AbstractApplicationContext) ctx).close();
	}
}
