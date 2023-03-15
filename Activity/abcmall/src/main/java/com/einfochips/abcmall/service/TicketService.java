package com.einfochips.abcmall.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.einfochips.abcmall.Ticket;
import com.einfochips.abcmall.repository.TicketRepository;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepo;
	
	public Integer getBookedSeats(String movieName,LocalDate showDate,String showTime,String seatType) {
		Integer bookedSeats = ticketRepo.showbookedSeats(movieName, showDate, showTime, seatType);
		return bookedSeats != null ? bookedSeats : 0;
	}
	 public Ticket bookTicket(@ModelAttribute Ticket ticket) {
		 return ticketRepo.save(ticket);
	 }

}
