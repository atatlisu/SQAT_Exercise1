import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testIsSpare() {
		Frame test = new Frame(5,5);
		assertTrue(test.isSpare());
	}
    @Test
    public void testIsStrike(){
    	Frame test = new Frame(10,0);  
    	assertTrue(test.isStrike());
    }
    @Test
    public void testBasicCalc(){
    	Frame test = new Frame(3,4);
    	assertTrue(test.score()==7);
    }
}
