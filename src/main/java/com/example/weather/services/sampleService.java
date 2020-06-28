package com.example.weather.services;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class sampleService {

	public List<Integer> sort(List<Integer> list) {
		Collections.sort(list);
 		return list;
	}

}
