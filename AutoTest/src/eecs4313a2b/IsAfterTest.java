package eecs4313a2b;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class IsAfterTest {

	@Test
	public void testIsAfter() {
		// test using equivalence class testing
		// variation: weak robust
		// which means we will test incorrect dates
		
		Date d1 = new Date();
		Date d2 = new Date();
		
		
		
	}
/*public static boolean isAfter(Date d1, Date d2) {

		GregorianCalendar tcal = new GregorianCalendar();
		tcal.setTime(d1);
		tcal.set(Calendar.HOUR_OF_DAY, 0);
		tcal.set(Calendar.MINUTE, 0);
		tcal.set(Calendar.SECOND, 0);
		GregorianCalendar dcal = new GregorianCalendar();
		dcal.setTime(d2);
		dcal.set(Calendar.HOUR_OF_DAY, 0);
		dcal.set(Calendar.MINUTE, 10);
		dcal.set(Calendar.SECOND, 0);

		if (tcal.getTime().after(dcal.getTime())) {
			return true;
		}

		return false;
	}*/
}
