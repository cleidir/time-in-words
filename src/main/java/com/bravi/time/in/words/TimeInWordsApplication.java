package com.bravi.time.in.words;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bravi.time.in.words.service.HourService;

@SpringBootApplication
public class TimeInWordsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TimeInWordsApplication.class, args);
		
		HourService hourService = new HourService();
		
		System.out.println(new HourService().returnHourDescription(5, 01));
		System.out.println(hourService.returnHourDescription(5, 0));
		System.out.println(hourService.returnHourDescription(5, 15));
		System.out.println(hourService.returnHourDescription(5, 30));
		System.out.println(hourService.returnHourDescription(5, 40));
	}
}