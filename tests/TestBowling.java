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
    @Test
    public void testSpareCalc(){
    	BowlingGame test = new BowlingGame();
    	test.addFrame(new Frame(6,4));
    	test.addFrame(new Frame(8,0));
        assertTrue(test.score()==26);	
    }
    @Test
    public void testStrikeCalc(){
    	BowlingGame test = new BowlingGame();
    	test.addFrame(new Frame (10,0));
    	test.addFrame(new Frame(5,4));
    	assertTrue(test.score()==28);
    }

}

