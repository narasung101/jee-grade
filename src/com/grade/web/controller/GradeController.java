package com.grade.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.GradeBean;
import com.grade.web.serviceimpls.GradeServiceImpl;
import com.grade.web.services.GradeService;


@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("grade로 들어옴");
		String ssn = request.getParameter("ssn");
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		String soc = request.getParameter("soc");
		GradeBean param = new GradeBean();
		param.setEng(eng);
		param.setKor(kor);
		param.setMath(math);
		param.setSoc(soc);
		GradeService service = new GradeServiceImpl();
		service.createGrade(param);

				
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
