package com.grade.web.pool;

import java.io.File;

public class Constants {
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse_jee%sjee-grade%sWebContent%sresources%stxt%s",
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator);
	public static final String VIEW_PATH = "WEB-INF/views/%s/%s.jsp";
}
