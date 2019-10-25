package com.hcl.names;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {
	
	@RequestMapping("/Names")
	public ModelAndView nameDemo(){
		List<String> lstNames=new ArrayList<String>();
		lstNames.add("Hema");
		lstNames.add("Nive");
		lstNames.add("Jayakumar");
		lstNames.add("Rajalakshmi");
		lstNames.add("Shiva");
		return new ModelAndView("ShowPage","lists",lstNames);
	}

}
