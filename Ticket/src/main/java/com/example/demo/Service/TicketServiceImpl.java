package com.example.demo.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.demo.Passenger;
import com.example.demo.Ticket;

@Service
public class TicketServiceImpl implements TicketService{

	
	
	Map<Integer,Ticket> map=new HashMap<>();
	@Override
	public Ticket bookTicket(Passenger p) {
		// TODO Auto-generated method stub
		Ticket t=new Ticket();
		
		Random r=new Random(100);
		int id=r.nextInt();
		t.setTicketNum(String.valueOf(id));
		
		BeanUtils.copyProperties(p, t);
		t.setStatus("Confirmed");
		map.put(id, t);
		
		return t;
	}

	@Override
	public Collection<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		Collection<Ticket> values = map.values();
		return values;
	}
	
	

}
