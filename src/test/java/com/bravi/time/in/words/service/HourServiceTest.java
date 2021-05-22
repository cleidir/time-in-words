package com.bravi.time.in.words.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bravi.time.in.words.exceptions.InvalidHourException;

@SpringBootTest
public class HourServiceTest {

	private HourService hourService; 
	
	@BeforeEach
	public void before() {
		hourService = new HourService();
	}
	
	@Test
	public void shouldReturnInvalidHourExceptionWhenHourGreaterThanMaxRange() {
		Throwable exception = assertThrows(InvalidHourException.class, () -> { hourService.returnHourDescription(25, 15); } );
		assertThat(exception.getMessage()).isEqualTo("Hour informed is greater than acceptable max range.");
	}
	
	@Test
	public void shouldReturnHourDescription() {
		assertThat(hourService.returnHourDescription(5, 15)).isEqualTo("quarter past five");
	}
}