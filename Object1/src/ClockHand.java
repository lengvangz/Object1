/*
 * this class contains information about its value, upper limit, and provides
 * methods for advancing the hand, viewing its value, and printing the value
 */
public class ClockHand {
	private int value;
	private int limit;

	public ClockHand(int limit) {
		this.limit = limit;
		this.value = 0;
	}
	
	/*
	 * when the value reach its limit, it sets the value back to zero
	 */
	public void advance() {
		this.value += 1;

		if (this.value >= this.limit) {
			this.value = 0;
		}

	}

	public int value() {
		return this.value;
	}

	public String toString() {
		if (this.value < 10) {
			return "0" + this.value;
		}

		return "" + this.value;
	}
	

}