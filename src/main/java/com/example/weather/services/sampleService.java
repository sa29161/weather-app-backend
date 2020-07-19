package com.example.weather.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class sampleService {
	
	String apikey = "4c00b96512e1f3c334e3d7fcd3bc2dc2";

	RestTemplate restTemplate = new RestTemplate();
    
    
	public String getForecast(String city) throws Exception {
		String b = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/forecast?q="+city+"&units=imperial&appid=4c00b96512e1f3c334e3d7fcd3bc2dc2",String.class);
		return b;

    }
	public String getWeather(String city) throws Exception {
		String s = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+city+"&units=imperial&appid=4c00b96512e1f3c334e3d7fcd3bc2dc2",String.class);
		return s;
	}
		
	}

	