package com.qnu.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qnu.service.IBookService;

@Controller(value = "bookControllerOfWeb")
public class BookController {

	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView showList(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("web/book");
		return mav;
	}
}