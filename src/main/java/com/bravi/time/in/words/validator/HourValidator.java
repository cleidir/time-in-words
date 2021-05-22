package com.bravi.time.in.words.validator;

import com.bravi.time.in.words.exceptions.InvalidHourException;
import com.bravi.time.in.words.exceptions.InvalidMinuteException;

public class HourValidator {

	public void validate(int hourOfDay, int minute) {
		validateHourAcceptRange(hourOfDay);
		validateMinuteAcceptRange(minute);
	}
	
	private void validateHourAcceptRange(int hourOfDay) {
		if(hourOfDay > 12) {
			throw new InvalidHourException("Hour informed is greater than acceptable max range."); 
		}
		
		if(hourOfDay < 0) {
			throw new InvalidHourException("Hour informed is less than acceptable min range."); 
		}
	}
	
	private void validateMinuteAcceptRange(int minute) {
		if(minute > 60) {
			throw new InvalidMinuteException("Minute informed is greater than acceptable max range."); 
		}
		
		if(minute < 0) {
			throw new InvalidMinuteException("Minute informed is less than acceptable min range."); 
		}
	}
}