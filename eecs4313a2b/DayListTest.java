package eecs4313a2b;

import net.sf.borg.model.Repeat;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class DayListTest {
	
	@Test
	public void testDayList(){
		
		/*
		 * Conditions:
		 * C1: Input is empty
		 * C2: Input has a comma seperator between "dlist" and the day values
		 * C3: Input doesn't have a comma seperator between "dlist" and the day values
		 * C4: Input has "dlist" but no numbers afterwards
		 * C5: Input contains a valid sequence of numbers
		 * C6: Non number after "dlist"
		 * C7: Non number in between numbers
		 * 
		 * Actions:
		 * A1: Return empty list
		 * A2: Return a list of the extracted numbers
		 * 
		 * 
		 * C1 -> A1
		 * C2 -> A2
		 * C3 -> A2
		 * C4 -> A1
		 * C5 -> A2
		 *
		 * 
		 */
		
				
		List<Integer> sq = new ArrayList<Integer>();
		
		
		// C1 -> A1
		assertEquals(sq, Repeat.getDaylist(""));
		
		//C4 -> A1
		assertEquals(sq, Repeat.getDaylist("dlist, "));
		
		//C6 -> A1
		assertEquals(sq, Repeat.getDaylist("dlist, agc"));
		
		//C2 -> A1
		sq.add(1);
		assertEquals(sq, Repeat.getDaylist("dlist, 1"));
		
		//C3 -> A1
		sq.add(2);
		assertEquals(sq, Repeat.getDaylist("dlist 12"));
		
		//C6 -> A1
		assertEquals(sq, Repeat.getDaylist("dlist, 1agc2"));

		
		// C4 => A1
		for (int i = 1; i < 7; i++){
			String val = "dlist,";
			
			List<Integer> sequence = new ArrayList<Integer>();
			sequence.add(i);
			val += i;
			assertEquals(sequence, Repeat.getDaylist(val));
			
			for(int j = i + 1; j < 7; j++){
				sequence.add(j);
				val += j;
				assertEquals(sequence, Repeat.getDaylist(val));
			}
			
		}
		
		
		
		
	}
	
}