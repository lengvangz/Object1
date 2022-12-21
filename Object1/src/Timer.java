/*
 * this class advances the ClockHand if the value is equal to zero and prints the time
 */
public class Timer {
	private ClockHand hundredth;
	private ClockHand seconds;

	
	public Timer() {
		this.hundredth = new ClockHand(100);
		this.seconds = new ClockHand(60);

	}
	
	/*
	 * advance the second hand and other hands if required
	 */
	public void advance() {
		this.hundredth.advance();
		
		if(this.hundredth.value() == 0) {
			this.seconds.advance();
			
		}
	}
	
	/*
	 * prints the time
	 */
	public String toString() {
		return hundredth + ":" + seconds;
	}

}