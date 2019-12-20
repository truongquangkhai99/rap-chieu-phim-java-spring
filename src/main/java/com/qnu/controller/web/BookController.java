package com.qnu.controller.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qnu.dto.BillDTO;
import com.qnu.dto.FilmDTO;
import com.qnu.dto.ScheduleDTO;
import com.qnu.service.IBillService;
import com.qnu.service.IFilmService;
import com.qnu.service.IScheduleService;
import com.qnu.util.MessageUtil;

@Controller(value = "bookControllerOfWeb")
public class BookController {

	@Autowired
	private IFilmService filmService;
	
	@Autowired 
	private IScheduleService scheduleService;
	
	@Autowired
	private IBillService billService;
	
	@Autowired
	private MessageUtil messageUtil;
	
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView bookingTicket(HttpServletRequest request, @RequestParam("id") Long id) {
		
		String seats = "";
		ModelAndView mav = new ModelAndView("web/book");
		
		//Tìm suất chiếu theo id để lấy phim và giờ bắt đầu
		ScheduleDTO scheduleDTO = scheduleService.findById(id);  
		
		//Tìm phim sau khi đã tìm ra suất chiếu đó
		FilmDTO filmDTO = filmService.findById(scheduleDTO.getIdFilm());
		
		//Tìm tất cả các bill có trong suất chiếu có id là id để load lên ghế ngồi
		List<BillDTO> bills = billService.findAllByIdSchedule(id);
		for (int i = 0; i < bills.size(); i++) {
			seats = seats + bills.get(i).getSeat() + ",";
		}
		
		//gửi message
		if (request.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(request.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		
		//Gửi dữ liệu về client
		mav.addObject("seats", seats);
		mav.addObject("bills", bills);
		mav.addObject("filmDTO", filmDTO);
		mav.addObject("scheduleDTO", scheduleDTO);
		return mav;
	}
}