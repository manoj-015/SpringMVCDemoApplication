package in.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Manoj Gollapelli");
		System.out.println("home controller called");
		return "home";
	}
}

