package com.bravi.time.in.words;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HourConverterTest {

	@Test
	public void shouldReturnHourZero() {
		assertThat(HourConverter.convertToText(0)).isEqualTo("zero");
	}
	
	@Test
	public void shouldReturnHourOne() {
		assertThat(HourConverter.convertToText(1)).isEqualTo("one");
	}
	
	@Test
	public void shouldReturnHourTwo() {
		assertThat(HourConverter.convertToText(2)).isEqualTo("two");
	}
	
	@Test
	public void shouldReturnHourThree() {
		assertThat(HourConverter.convertToText(3)).isEqualTo("three");
	}
	
	@Test
	public void shouldReturnHourFour() {
		assertThat(HourConverter.convertToText(4)).isEqualTo("four");
	}
	
	@Test
	public void shouldReturnHourFive() {
		assertThat(HourConverter.convertToText(5)).isEqualTo("five");
	}
	
	@Test
	public void shouldReturnHourSix() {
		assertThat(HourConverter.convertToText(6)).isEqualTo("six");
	}
	
	@Test
	public void shouldReturnHourSeven() {
		assertThat(HourConverter.convertToText(7)).isEqualTo("seven");
	}
	
	@Test
	public void shouldReturnHourEight() {
		assertThat(HourConverter.convertToText(8)).isEqualTo("eight");
	}
	
	@Test
	public void shouldReturnHourNine() {
		assertThat(HourConverter.convertToText(9)).isEqualTo("nine");
	}

	@Test
	public void shouldReturnHourTen() {
		assertThat(HourConverter.convertToText(10)).isEqualTo("ten");
	}
	
	@Test
	public void shouldReturnHourEleven() {
		assertThat(HourConverter.convertToText(11)).isEqualTo("eleven");
	}
	
	@Test
	public void shouldReturnHourTwelve() {
		assertThat(HourConverter.convertToText(12)).isEqualTo("twelve");
	}
	
	@Test
	public void shouldReturnHourThirteen() {
		assertThat(HourConverter.convertToText(13)).isEqualTo("thirteen");
	}
	
	@Test
	public void shouldReturnHourFourteen() {
		assertThat(HourConverter.convertToText(14)).isEqualTo("fourteen");
	}
	
	@Test
	public void shouldReturnHourFifteen() {
		assertThat(HourConverter.convertToText(15)).isEqualTo("fifteen");
	}
	
	@Test
	public void shouldReturnHourSixteen() {
		assertThat(HourConverter.convertToText(16)).isEqualTo("sixteen");
	}
	
	@Test
	public void shouldReturnHourSeventeen() {
		assertThat(HourConverter.convertToText(17)).isEqualTo("seventeen");
	}
	
	@Test
	public void shouldReturnHourEighteen() {
		assertThat(HourConverter.convertToText(18)).isEqualTo("eighteen");
	}
	
	@Test
	public void shouldReturnHourNineteen() {
		assertThat(HourConverter.convertToText(19)).isEqualTo("nineteen");
	}
	
	@Test
	public void shouldReturnHourTwenty() {
		assertThat(HourConverter.convertToText(20)).isEqualTo("twenty");
	}
	
	@Test
	public void shouldReturnHourThirty() {
		assertThat(HourConverter.convertToText(30)).isEqualTo("thirty");
	}
	
	@Test
	public void shouldReturnHourThirtyOne() {
		assertThat(HourConverter.convertToText(31)).isEqualTo("thirty one");
	}
	
	@Test
	public void shouldReturnHourForty() {
		assertThat(HourConverter.convertToText(40)).isEqualTo("forty");
	}
	
	@Test
	public void shouldReturnHourFifty() {
		assertThat(HourConverter.convertToText(50)).isEqualTo("fifty");
	}
	
	@Test
	public void shouldReturnHourSixty() {
		assertThat(HourConverter.convertToText(60)).isEqualTo("sixty");
	}
	
//	@Test
//	public void shouldReturnHourSeventy() {
//		assertThat(HourConverter.convertToText(70)).isEqualTo("seventy");
//	}
//	
//	@Test
//	public void shouldReturnHourEighty() {
//		assertThat(HourConverter.convertToText(80)).isEqualTo("eighty");
//	}
//	
//	@Test
//	public void shouldReturnHourNinety() {
//		assertThat(HourConverter.convertToText(90)).isEqualTo("ninety");
//	}
}