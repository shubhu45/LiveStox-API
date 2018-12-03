package com.Stox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController
{
	@RequestMapping("/search")
	public String search()
	{
		return "Display.jsp";
	}

}
