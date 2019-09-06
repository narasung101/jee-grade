package com.grade.web.serviceimpls;

import com.grade.web.daoimpls.GradeDAOImpl;
import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;
import com.grade.web.services.GradeService;
import java.util.Random;
import java.util.Date;


public class GradeServiceImpl implements GradeService {
	
	private GradeDAO dao;
	
	public GradeServiceImpl() {
		dao = new GradeDAOImpl();
	}

	@Override
	public void createGrade(GradeBean param) {
		GradeBean g = new GradeBean();
		//param.setHakbun(hakbun);
		param.getKor();
		param.getEng();
		param.getMath();
		param.getName();
		param.getSoc();
		param.getSsn();
		createHakBun(param);
		createTotal(param);
		System.out.println(param.getKor());
	
	}
	
	public void createHakBun(GradeBean para) {
		String hakbun = "2019-";
		hakbun = hakbun + para.getSsn().substring(0,1);
		Random ran = new Random();
		hakbun = hakbun + ran.nextInt(999);
		System.out.println(hakbun);
		para.setHakbun(hakbun);
		System.out.println(para.getKor());
		
	}
	
	public void createTotal(GradeBean param) {
		String total = Integer.parseInt(param.getEng()) + 
				Integer.parseInt(param.getKor()) +
				Integer.parseInt(param.getMath()) +
				Integer.parseInt(param.getSoc())+"";
		
		param.setTotal(total);
		
		
						
	}
	
	public void createAvg(GradeBean param) {
		String total = Integer.parseInt(param.getEng()) + 
				Integer.parseInt(param.getKor()) +
				Integer.parseInt(param.getMath()) +
				Integer.parseInt(param.getSoc())+"";
		int avg = Integer.parseInt(total)/4;
		
		param.setAvg(String.valueOf(avg));
		
	}
	
	}
	 


