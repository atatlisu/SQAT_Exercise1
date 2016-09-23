import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testIsSpare() {
		Frame test = new Frame(5,5);
		int score = test.score();
		assertTrue(test.score()==10);
	}

}
