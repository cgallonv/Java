package com.spring.learnspringframework.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.learnspringframework.sample.enterprise.flow.data.DataService;

@Component
public class BusinessService {
	//where business logic will be present

	@Autowired
	private DataService dataService;

	public long calculateSum() {
		List<Integer> data = dataService.retrieveData();
		// .get to return values.
		return data.stream().reduce(Integer::sum).get();
	}

}