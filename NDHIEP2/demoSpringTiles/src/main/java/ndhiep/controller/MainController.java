package ndhiep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping(value = {"/","/home" }, method = RequestMethod.GET)
	public String homePage(Model model) {
		return "homePage";
	}

	@RequestMapping(value = { "/contact" }, method = RequestMethod.GET)
	public String contactusPage(Model model) {
		model.addAttribute("address", "Vietnam");
		model.addAttribute("phone", "096160593");
		model.addAttribute("email", "daihiepit33@gmail.com");
		return "contactPage";
	}
	@RequestMapping(value={"/introduce"}, method=RequestMethod.GET)
	public String introducePage(Model model){
		return "introducePage";
	}

}
