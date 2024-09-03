package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Passenger;
import com.example.demo.Ticket;
import com.example.demo.Service.MakeMyTripService;

//import ch.qos.logback.core.model.Model;

@Controller
public class MakeMyTripController {
	
	@Autowired
	private MakeMyTripService ser;
	
	
	@GetMapping("/")
	public String index(Model model)
	{
	  List<Ticket> all = ser.getAll();
	  model.addAttribute("allTickets", all);
	  
	  return "index";
	}
	
	@GetMapping("/bookTicket")
	public String bookTicket(Model model)
	{
		model.addAttribute("p", new Passenger());
		return "bookTicket";
	}
	
	@PostMapping("/ticket")
	public String ticketBooking(@ModelAttribute("p") Passenger p,Model model)
	{
		System.out.println(p);
		Passenger pg=new Passenger();
		pg.setName(p.getName());
		pg.setFrom(p.getFrom());
		pg.setTo(p.getTo());
		Ticket bookTicket = ser.bookTicket(p);
		model.addAttribute("msg", "your ticket booked");
		
		return "bookTicket";
	}
	

}
