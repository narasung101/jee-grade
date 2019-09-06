package com.grade.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.StudentBean;
import com.grade.web.pool.Constants;
import com.grade.web.serviceimpls.StudentServiceimpl;
import com.grade.web.services.StudentService;



@WebServlet("/stduent.do")
public class StduentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action){
		case "move" :
			request.getRequestDispatcher
	         (String.format(Constants.VIEW_PATH,"student", request.getParameter("dest")))
	          .forward(request, response);
			break;
			
		case "register" : 
			
			String hakbun = request.getParameter("hakbun");
			String ssn = request.getParameter("ssn");
			String name = request.getParameter("name");
			StudentBean param = new StudentBean();
			param.setHakbun(hakbun);
			param.setName(name);
			param.setSsn(ssn);
			StudentService service = new StudentServiceimpl();
			
						
			request.getRequestDispatcher
	         (String.format(Constants.VIEW_PATH,"student", request.getParameter("dest")))
	          .forward(request, response);
						
			break;
			
		case "login" :
			System.out.println("로그인진입");
			request.getRequestDispatcher
	         (String.format(Constants.VIEW_PATH,"student", request.getParameter("dest")))
	          .forward(request, response);
			
			break;
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
