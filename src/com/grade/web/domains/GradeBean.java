package com.grade.web.domains;

public class GradeBean {
	private String hakbun, ssn, name, kor, eng, math, soc, total, avg;

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getSoc() {
		return soc;
	}

	public void setSoc(String soc) {
		this.soc = soc;
	}
	
	
	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "GradeBean [hakbun=" + hakbun + ", ssn=" + ssn + ", name=" + name + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math + ", soc=" + soc + ", total=" + total + ", avg=" + avg + "]";
	}
	
	

}
	


