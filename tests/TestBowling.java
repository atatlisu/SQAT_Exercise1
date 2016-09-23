import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testIsSpare() {
		BowlingGame test = new BowlingGame();
		int firstThrow=5;
		int secondThow=5;
		int score = test.score();
		assertTrue(test.score()==0);
	}

}
