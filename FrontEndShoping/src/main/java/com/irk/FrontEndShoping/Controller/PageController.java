package com.irk.FrontEndShoping.Controller;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author HP
 *
 */
@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView getPage() {
		ModelAndView mv = new ModelAndView("newPage");
		mv.addObject("Greeting", "Hello its Greeting from Controller");
		return mv;
	}
	
	@RequestMapping(value= {"/test/{greeting}"})
	public ModelAndView test(@PathVariable(value="greeting", required=false) String greeting) {
		if(greeting == null) {
			greeting = "Hello there is not Message for you";
		}
		ModelAndView mv = new ModelAndView("newPage");
		mv.addObject("Greeting", greeting);
		return mv;
	}
}
