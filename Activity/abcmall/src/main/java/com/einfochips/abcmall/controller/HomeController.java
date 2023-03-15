package com.einfochips.abcmall.controller;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.abcmall.Ticket;
import com.einfochips.abcmall.repository.TicketRepository;
import com.einfochips.abcmall.service.TicketService;

@RestController
public class HomeController {
	
	@Autowired
	private TicketService ticketService;
	
	@RequestMapping("/")
	public ModelAndView getHomePage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("ticketbooking")
	public ModelAndView getBookingPage() {
		return new ModelAndView("booking");
	}
	
	@RequestMapping("bookticket")
	public ModelAndView getSuccessPage(@ModelAttribute Ticket ticket,@RequestParam String movieName, @RequestParam LocalDate showDate,@RequestParam String showTime,@RequestParam String seatType,@RequestParam int noOfSeats ) {
		ModelAndView mv =new ModelAndView("success");
		
		int bookedSeats = ticketService.getBookedSeats(movieName, showDate, showTime, seatType);
		if(seatType.equalsIgnoreCase("Economy Rs.150")) {
			int availableSeats = 300-bookedSeats;
			if(noOfSeats>availableSeats) {
				mv.addObject("error", "Seats not Available");
			}
			else {
				ticketService.bookTicket(ticket);
				int amount = 150*noOfSeats;
				mv.addObject("success", "Thank You for your Booking.You have paid Rs."+amount);
			}
		}
		if(seatType.equalsIgnoreCase("Platinum Rs.250")) {
			int availableSeats = 100-bookedSeats;
			if(noOfSeats>availableSeats) {
				mv.addObject("error", "Seats not Available");
			}
			else {
				ticketService.bookTicket(ticket);
				int amount = 250*noOfSeats;
				mv.addObject("success", "Thank You for your Booking.You have paid Rs."+amount);
			}
		}
		return mv;
	}
	
	
}
