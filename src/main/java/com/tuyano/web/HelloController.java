package com.tuyano.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("message")
public class HelloController {

	@Autowired
	//MySpringBean bean;
	MyDataEntityRepository repository;

//	@ModelAttribute("message")
//	String message() {
//		return "This is default message.";
//	}


	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String index(@ModelAttribute("message")String msg, Model model) {
//		System.out.println("@ModelAttribute(\"message\"):" + msg);
//		model.addAttribute("title", "Hello Page");
//
//		return "hello";
//	}

	public String index(Model model) {
		model.addAttribute("title", "Hello Page");
		model.addAttribute("message", "MyDataEntity List.");
		List<MyDataEntity> data = repository.findAll();
		model.addAttribute("data", data);
		return "hello";
	}

	@RequestMapping(value="/", method=RequestMethod.POST)
	public String form(@ModelAttribute("message")String msg
			, @RequestParam("find")String find, Model model) {

		model.addAttribute("title", "Answer Page");
		model.addAttribute("value", find);
		model.addAttribute("message", "MyDataEntity List.");

		List<MyDataEntity> data = repository.findByName(find);
		model.addAttribute("data", data);
		return "hello";
	}
}
