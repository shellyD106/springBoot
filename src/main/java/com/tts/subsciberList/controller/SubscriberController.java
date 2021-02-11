package com.tts.subsciberList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tts.subsciberList.model.Subscriber;

@Controller
public class SubscriberController {
	
	@Autowired
	private SubscriberRepository subscriberRepository
	
	@GetMapping(value = "/")
public String index(Subscriber subscriber) {
	return "subscriber/index";
	

	@PostMapping(value="/")
	public String addNewSubscriber(Subscriber subscriber, Model model) {
		Subscriber subscriberToAdd = new Subscriber(subscriber.getFirstName(), 
				subscriber.getLastName
				)
				subscriber.getUsername());
			subscriberRepository.save(subscriberToAdd);
			model.addAttribute("firstName", subscribe)
	}
}
}