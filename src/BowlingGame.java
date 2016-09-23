import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	Iterator it = frames.iterator();
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
	frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		frames.add(new Frame(firstThrow,secondThrow));
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score
		while(it.hasNext()){
			Frame a = (Frame) it.next(); 
			if(a.isSpare()){
				Frame b = (Frame) it.next();
				return a.score() + b.getFirstThrow();
			}
			
		}
		return 0;
		
	}
}
