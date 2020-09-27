package com.example.weather.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.weather.services.sampleService;

@RestController
@RequestMapping("/settings")
@CrossOrigin
public class Settings {

	@Autowired
	private sampleService SampleService;

	@RequestMapping(value = "/weather")
	@ResponseBody
	public ResponseEntity<String> getWeather(@RequestParam String city) throws Exception{
		return new ResponseEntity<String>(SampleService.getWeather(city),HttpStatus.OK);}
	
	@RequestMapping(value = "/forecast")
	@ResponseBody
	public ResponseEntity<String> getForecast(@RequestParam String city) throws Exception{
		return new ResponseEntity<String>(SampleService.getForecast(city),HttpStatus.OK);}
		

}
