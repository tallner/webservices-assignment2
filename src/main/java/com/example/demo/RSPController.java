package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RSPController {
	
	private String player1Move = "";
	private String player2Move = "computer";
	
	@RequestMapping(
			path = "/RPC",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public String evaluateUserInput(
			String player1Move, 
			String player2Move){
		
		this.player1Move = player1Move;
		this.player2Move = player2Move;
		
		return "{ \"data\": \"value\" }";
	}
	

}
