package com.bravi.time.in.words.validator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bravi.time.in.words.exceptions.InvalidHourException;
import com.bravi.time.in.words.exceptions.InvalidMinuteException;

@SpringBootTest
public class HourValidatorTest {
	
	private HourValidator hourValidator; 
	
	@BeforeEach
	public void before() {
		hourValidator = new HourValidator();
	}
	
	@Test
	public void shouldPassWithoutThrowException() {
		hourValidator.validate(5, 15);
	}

	@Test
	public void shouldReturnInvalidHourExceptionWhenHourGreaterThanMaxRange() {
		Throwable exception = assertThrows(InvalidHourException.class, () -> { hourValidator.validate(13, 15); } );
		
		assertThat(exception.getMessage()).isEqualTo("Hour informed is greater than acceptable max range.");
	}
	
	@Test
	public void shouldReturnInvalidHourExceptionWhenHourLessThanMinRange() {
		Throwable exception = assertThrows(InvalidHourException.class, () -> { hourValidator.validate(-1, 15); } );
		
		assertThat(exception.getMessage()).isEqualTo("Hour informed is less than acceptable min range.");
	}
	
	@Test
	public void shouldReturnInvalidMinuteExceptionWhenMinuteGreaterThanMaxRange() {
		Throwable exception = assertThrows(InvalidMinuteException.class, () -> { hourValidator.validate(5, 61); } );
		
		assertThat(exception.getMessage()).isEqualTo("Minute informed is greater than acceptable max range.");
	}
	
	@Test
	public void shouldReturnInvalidMinuteExceptionWhenMinuteLessThanMinRange() {
		Throwable exception = assertThrows(InvalidMinuteException.class, () -> { hourValidator.validate(5, -1); } );
		
		assertThat(exception.getMessage()).isEqualTo("Minute informed is less than acceptable min range.");
	}
}