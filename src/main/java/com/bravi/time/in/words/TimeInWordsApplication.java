package com.bravi.time.in.words;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bravi.time.in.words.service.HourService;

@SpringBootApplication
public class TimeInWordsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TimeInWordsApplication.class, args);
		
		HourService hourService = new HourService();

		
		//TODO pass hour informations
		System.out.println(new HourService().returnHourDescription(5, 01));
		System.out.println(hourService.returnHourDescription(3, 0));
		System.out.println(hourService.returnHourDescription(7, 15));
		
		
		//TODO
		//review the code
		//create script to run the app on CLI
		//Create readme.md
		
//		System.out.println(HourTextGenerator.generate(5, 01));
//		System.out.println(HourTextGenerator.generate(5, 01));
//		System.out.println(HourTextGenerator.generate(3, 0));
//		System.out.println(HourTextGenerator.generate(7, 15));
	}
}