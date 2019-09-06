package com.grade.web.domains;

public class StudentBean {
private String hakbun, ssn, name;

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

@Override
public String toString() {
	return "StduentBean [hakbun=" + hakbun + ", ssn=" + ssn + ", name=" + name + "]";
}

}
