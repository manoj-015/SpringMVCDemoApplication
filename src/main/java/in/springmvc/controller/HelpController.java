package in.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelpController {
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("in help controller");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","Testing");
		mv.setViewName("help");
		return mv;
	}
}
