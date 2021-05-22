package com.bravi.time.in.words;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bravi.time.in.words.service.HourService;

@SpringBootTest
class TimeInWordsApplicationTests {

	@Test
	void shouldPassWithSuccess() {
		assertThat(new HourService().returnHourDescription(5, 0)).isEqualTo("five o' clock");
	}
}