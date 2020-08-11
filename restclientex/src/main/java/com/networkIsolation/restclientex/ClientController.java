package com.networkIsolation.restclientex;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class ClientController {

	private static final Logger log = LoggerFactory.getLogger(ClientController.class);

	@GetMapping("/callService")
	public ResponseEntity<String> getMessage()
	{
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> message = restTemplate.getForEntity("http://localhost:8080/Hello",String.class);
		log.info("Successfull call to http://localhost:8080/Hello");
		return message;
	}
	
}
