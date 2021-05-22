package com.bravi.time.in.words;

public class HourConverter {

	static final String[] NUMBER_NAMES_ARRAY = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	static final String[] TEEN_WORDS_ARRAY = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	static final String[] TEN_WORDS_ARRAY = { null, "ten", "twenty", "thirty", "forty", "fifty", "sixty"};

	public static String convertToText(int hour) {
		if (hour >= 10 && hour < 20) {
			return TEEN_WORDS_ARRAY[hour - 10];
		}
		if (hour < 10) {
			return NUMBER_NAMES_ARRAY[hour];
		}
		if (hour % 10 == 0) {
			return TEN_WORDS_ARRAY[hour / 10];
		}
		return TEN_WORDS_ARRAY[hour / 10] + " " + NUMBER_NAMES_ARRAY[hour % 10];
	}
}