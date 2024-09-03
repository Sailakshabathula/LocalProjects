package com.example.demo.Sender;


	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jms.core.JmsTemplate;
	import org.springframework.stereotype.Component;
	
@Component
 public class Sender {

	    @Autowired
	    private JmsTemplate jmsTemplate;

	    public void sendMessage(String destinationName, String message) {
	        jmsTemplate.convertAndSend(destinationName, message);
	        System.out.println("Sent message: " + message);
	    
	}


}
