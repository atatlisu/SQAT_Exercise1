import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	// Tests for Frame.java
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
   
    // Tests for BowlingGame.java
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
    @Test
    public void testGivenExample(){
    	BowlingGame test = new BowlingGame();
    	test.addFrame(new Frame (1,4));
    	test.addFrame(new Frame(4,5));
    	test.addFrame(new Frame (6,4));
    	test.addFrame(new Frame(5,5));
    	test.addFrame(new Frame (10,0));
    	test.addFrame(new Frame(0,1));
    	test.addFrame(new Frame (7,3));
    	test.addFrame(new Frame(6,4));
    	test.addFrame(new Frame (10,0));
    	test.addFrame(new Frame(2,8));
    	test.addFrame(new Frame(6,0));// bonus frame
    	assertTrue(test.score()==133);
    }
    
}

