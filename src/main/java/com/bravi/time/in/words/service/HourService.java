package com.bravi.time.in.words.service;

import com.bravi.time.in.words.HourTextGenerator;
import com.bravi.time.in.words.validator.HourValidator;

public class HourService {
	
	private HourValidator hourValidator;
	
	public HourService() {
		hourValidator = new HourValidator();
	}

	public String returnHourDescription(int hourOfDay, int minute) {
		hourValidator.validate(hourOfDay, minute);
		return HourTextGenerator.generate(hourOfDay, minute);
	}
}