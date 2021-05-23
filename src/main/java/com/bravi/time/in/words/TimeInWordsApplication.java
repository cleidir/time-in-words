package com.bravi.time.in.words;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bravi.time.in.words.service.HourService;

@SpringBootApplication
public class TimeInWordsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TimeInWordsApplication.class, args);
		HourService hourService = new HourService();

		generateInicializationNote();
		
    Scanner userInput = new Scanner(System.in);
    try {
        while (true) {
          System.out.println(" Inform the hour: ");
            int hour = userInput.nextInt();
            System.out.println(" Inform the minute: ");
            System.out.println("\r\n ");
            int minute = userInput.nextInt();
            System.out.println(" The informed hour is:  " +  hourService.returnHourDescription(hour, minute));
            System.out.println("\r\n ");
        }
    } catch (Exception e) {
      e.printStackTrace();
      userInput.close();
      System.out.println("The system \"Time in words \" was closed.");
    }
  }

	private static void generateInicializationNote() {
		System.out.println("");
		System.out.println(" *********************************************************");
		System.out.println(" * NOTE: This application just accept AM/PM hour format! *");
		System.out.println(" *********************************************************");
		System.out.println("");
	}
}