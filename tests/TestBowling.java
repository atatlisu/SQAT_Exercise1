import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testIsSpare() {
		Frame test = new Frame(5,5);
		int score = test.score();
		assertTrue(test.isSpare());
	}
    @Test
    public void testIsStrike(){
    	Frame test = new Frame(10,0);
    	int score = test.score();
    	assertTrue(test.isStrike());
    }
}
