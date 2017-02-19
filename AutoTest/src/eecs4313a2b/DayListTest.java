package AutoTest.src.eecs4313a2b;

import net.sf.borg.model.Repeat;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

public class DayListTest {
	
	@Test
	public void testDayList(){
		
		/*
		 * Conditions:
		 * C1: Input is empty
		 * C2: Input has a comma seperator between "dlist" and the day values
		 * C3: Input doesn't have a comma seperator between "dlist" and the day values
		 * C4: Input contains a 1
		 * C5: Input contains a 2
		 * 
		 */
		Collection<Integer> dlist = Repeat.getDaylist("dlist 77");
		System.out.println(dlist);
		
		int[] allInts = {1, 2, 3, 4, 5, 6, 7};
		int k = 7;
		String val = "dlist , ";
		
		for (int i = 0; i < 7; i++){
			
			
			
			
		}
		
		
		
		
	}
	
}
