package com.bravi.time.in.words;

public class HourTextGenerator {

	private static final int ONE_MINUTE = 1;
	private static final int FIFTEEN_MINUTES = 15;
	private static final int THIRTY_MINUTES = 30;
	private static final int FORTY_FIVE_MINUTES = 45;
	private static final int FIFTY_NINE_MINUTES = 59;
	private static final int SIXTY_MINUTES = 60; 

	public static String generate(int hourOfDay, int minute) {
		if (minute == 0) {
			return HourConverter.convertToText(hourOfDay) + " o' clock";
		}
		if (ONE_MINUTE == minute) {
			return "one minute past " + HourConverter.convertToText(hourOfDay);
		}
		if (FIFTEEN_MINUTES == minute) {
			return "quarter past " + HourConverter.convertToText(hourOfDay);
		}
		if (minute < THIRTY_MINUTES) {
			return HourConverter.convertToText(minute) + " minutes past " + HourConverter.convertToText(hourOfDay);
		}
		if (minute == THIRTY_MINUTES) {
			return "half past " + HourConverter.convertToText(hourOfDay);
		}
		if (FORTY_FIVE_MINUTES == minute) {
			return "quarter to " + HourConverter.convertToText(hourOfDay + ONE_MINUTE);
		}
		if (FIFTY_NINE_MINUTES == minute) {
			return "one minute to " + HourConverter.convertToText(hourOfDay + ONE_MINUTE);
		}
		return HourConverter.convertToText(SIXTY_MINUTES - minute) + " minutes to " + HourConverter.convertToText(hourOfDay + 1);
	}
}
