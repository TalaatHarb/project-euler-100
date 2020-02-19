package net.talaatharb.projecteuler100;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * P019
 * 
 * @author mharb
 *
 */
public class P019 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P019().run();
	}

	@Override
	public Number solve() {
		problemNumber = 19;
		int result = 0;

		final GregorianCalendar gcalendar = new GregorianCalendar();
		gcalendar.clear();
		gcalendar.set(1901, 0, 1); // First day
		gcalendar.add(Calendar.DAY_OF_MONTH, 5); // First Sunday

		final GregorianCalendar lastDay = new GregorianCalendar();
		lastDay.clear();
		lastDay.set(2000, 11, 31); // Last day

		while (gcalendar.compareTo(lastDay) < 0) {
			gcalendar.add(Calendar.DAY_OF_MONTH, 7);
			if (gcalendar.get(Calendar.DAY_OF_MONTH) == 1) {
				result++;
			}
		}

		return result;
	}

}
