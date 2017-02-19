package AutoTest.eecs4313a2b;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import net.sf.borg.common.DateUtil;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IsAfterTest {
	
	public static boolean isAfter(Date d1, Date d2) {

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
	}
	
	@Test
	public void testIsAfter(){
		Date d1 = new Date(3, 1, 1994);
		Date d2 = new Date(4, 1, 1994);
		
		assertTrue(DateUtil.isAfter(d2, d1));
	}
	
}
