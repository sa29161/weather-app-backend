package com.example.weather.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.weather.dto.ListDTO;
import com.example.weather.services.sampleService;

@RestController
@RequestMapping("/settings")
public class Settings {

	@Autowired
	private sampleService SampleService;

	@RequestMapping(value = "/sort", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<List<Integer>> sort(@RequestBody ListDTO list) {
		if(list == null || list.getList().isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
				
		return new ResponseEntity<List<Integer>>(SampleService.sort(list.getList()), HttpStatus.OK);
	}

	@GetMapping(value = "/health")
	public ResponseEntity<String> health() {
		return new ResponseEntity<String>("Hello!", HttpStatus.OK);
	}

}
