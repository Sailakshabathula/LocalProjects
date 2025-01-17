package com.example.demo.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BookTicket;
import com.example.demo.Passenger;
import com.example.demo.Ticket;
import com.example.demo.Service.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService ser;
	
	@PostMapping(value="/ticket",consumes="application/json",produces="application/json")
	public ResponseEntity<Ticket> bookTicket(Passenger p)
	{
		Ticket bookTicket = ser.bookTicket(p);
		System.out.println(bookTicket);
		return new ResponseEntity<>(bookTicket,HttpStatus.CREATED);
	}
	
	@GetMapping("/tickets")
	public ResponseEntity<Collection<Ticket>> getTickets()
	{
		Collection<Ticket> allTicket = ser.getAllTicket();
		return new ResponseEntity<>(allTicket,HttpStatus.OK);
	}
	@PostMapping(value="/bookticket")
	public ResponseEntity<BookTicket> ticketBook(Passenger p)
	{
		System.out.println(p);
		BookTicket ticketBook = ser.ticketBook(p);
		System.out.println(ticketBook);
		return new ResponseEntity<>(ticketBook,HttpStatus.CREATED);
		
	}

}
