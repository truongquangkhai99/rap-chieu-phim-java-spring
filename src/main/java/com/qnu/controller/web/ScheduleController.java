package com.qnu.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qnu.dto.ScheduleDTO;
import com.qnu.service.IScheduleService;

@Controller(value = "scheduleControllerOfWeb")
public class ScheduleController {

    @Autowired
	private IScheduleService scheduleService;
    
	@RequestMapping(value = "/schedule", method = RequestMethod.GET)
	public ModelAndView showList(HttpServletRequest request) {
		ScheduleDTO model = new ScheduleDTO();
		ModelAndView mav = new ModelAndView("web/schedules");
		model.setListResult(scheduleService.findAll());
		mav.addObject("model", model);
		return mav;
	}
}