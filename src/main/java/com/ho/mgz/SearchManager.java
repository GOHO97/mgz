package com.ho.mgz;

import javax.servlet.http.HttpServletRequest;

public class SearchManager {
	public static void search(HttpServletRequest req) {
		String search = req.getParameter("search");
		if(search == null) {
			search = "";
			
		}
		req.getSession().setAttribute("search", search);
	}
	
	public static void searchClear(HttpServletRequest req) {
		req.getSession().setAttribute("search", null);
	}
	
}
