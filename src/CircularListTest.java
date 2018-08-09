import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircularListTest {
	
	CircularList<Integer> clist;
	
	@Before
	public void setup() {
		clist = new CircularList<>();
	}
	
	@Test
	public void testBasicGet() {
		clist.add(1);
		clist.add(2);
		clist.add(3);
		
		assertEquals(new Integer(2), clist.get(1));
	}
	
	@Test
	public void testForwardOverFlow() {
		clist.add(1);
		clist.add(2);
		clist.add(3);
		
		assertEquals(new Integer(1), clist.get(3));
	}
	
	@Test 
	public void testBackwardOverFlow() {
		clist.add(1);
		clist.add(2);
		clist.add(3);
		
		assertEquals(new Integer(2), clist.get(-2));
	}
	
	@Test 
	public void testLongForwardOverFlow() {
		clist.add(1);
		clist.add(2);
		clist.add(3);
		
		assertEquals(new Integer(3), clist.get(8));
	}
	
	@Test 
	public void testLongBackwardOverFlow() {
		clist.add(1);
		clist.add(2);
		clist.add(3);
		
		assertEquals(new Integer(2), clist.get(-5));
	}
	
}