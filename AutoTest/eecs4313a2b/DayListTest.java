package AutoTest.eecs4313a2b;

import net.sf.borg.model.Repeat;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DayListTest {
	
	@Test
	public void testDayListECT(){
		String f = "dlist";
		String num = "1234";
		System.out.println(Repeat.getDaylist(f + "," + num ));
	}
	
}
