package com.einfochips.abcmall.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.einfochips.abcmall.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
	
	@Query("Select SUM(t.noOfSeats) from Ticket t where t.movieName= :movieName AND t.showDate= :showDate AND t.showTime= :showTime AND t.seatType= :seatType")
	Integer showbookedSeats(String movieName,LocalDate showDate,String showTime,String seatType);

}
