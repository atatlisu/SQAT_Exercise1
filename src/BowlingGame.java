import java.util.ArrayList;
import java.util.List;

//Finish time: 15.59
//ID: 160

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
	frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		frames.add(new Frame(firstThrow,0));
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score
		int totalScore = 0;
	for(int i=0; i<frames.size() ; i++){
	   if(frames.get(i).isSpare()&&i<9){ // i<9 for last throw if there is a bonus
		totalScore += frames.get(i).score();
		totalScore +=frames.get(i+1).getFirstThrow();
	   }else if(frames.get(i).isStrike()&&i<9){ // i<9 for last throw if there is a bonus
			totalScore += frames.get(i).score();
			totalScore +=frames.get(i+1).score();
	   }else {
		   totalScore += frames.get(i).score();
	   }
			
	}	
		return totalScore;
		
	}
}
