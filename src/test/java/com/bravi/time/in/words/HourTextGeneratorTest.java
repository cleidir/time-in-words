package com.bravi.time.in.words;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HourTextGeneratorTest {

	@Test
	public void shouldReturnFiveOClock() {
		assertThat(HourTextGenerator.generate(5,0)).isEqualTo("five o' clock");
	}
	
	@Test
	public void shouldReturnOneMinutePastFive() {
		assertThat(HourTextGenerator.generate(5,1)).isEqualTo("one minute past five");
	}

	@Test
	public void shouldReturnQuarterPastFive() {
		assertThat(HourTextGenerator.generate(5,15)).isEqualTo("quarter past five");
	}
	
	@Test
	public void shouldReturnTwentyEightMinutesPastFive() {
		assertThat(HourTextGenerator.generate(5,28)).isEqualTo("twenty eight minutes past five");
	}
	
	@Test
	public void shouldReturnHalfPastFive() {
		assertThat(HourTextGenerator.generate(5,30)).isEqualTo("half past five");
	}

	@Test
	public void shouldReturnQuarterToSix() {
		assertThat(HourTextGenerator.generate(5,45)).isEqualTo("quarter to six");
	}
	
	@Test
	public void shouldReturnOneMinuteToSix() {
		assertThat(HourTextGenerator.generate(5,59)).isEqualTo("one minute to six");
	}
	
	@Test
	public void shouldReturnTwentyMinutesToSix() {
		assertThat(HourTextGenerator.generate(5,40)).isEqualTo("twenty minutes to six");
	}
}