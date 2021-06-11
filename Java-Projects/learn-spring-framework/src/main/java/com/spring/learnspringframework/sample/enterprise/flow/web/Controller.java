package com.spring.learnspringframework.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learnspringframework.sample.enterprise.flow.business.BusinessService;

//Sending reponse in right format
@RestController
public class Controller {

	@Autowired
	private BusinessService businessService;

	// "/sum" => 100
	@GetMapping("/sum")
	public String displaySum() {
		String format = "<div> Hola Mundo este eta es la suma :</div>" + businessService.calculateSum();
		return format;
	}
}