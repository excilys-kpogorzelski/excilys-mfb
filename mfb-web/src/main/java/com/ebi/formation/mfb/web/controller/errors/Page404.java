package com.ebi.formation.mfb.web.controller.errors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Page404 {

	@RequestMapping("/404.php")
	public String redirect() {
		return "page404";
	}
}
