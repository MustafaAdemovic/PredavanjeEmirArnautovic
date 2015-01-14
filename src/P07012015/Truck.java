public class Truck {

	private char letter;
	private Truck nextTruck;

	public Truck(char letter) {
		super();
		this.letter = letter;

	}

	public void setTruck(Truck nextTruck) {
		this.nextTruck = nextTruck;
	}

	public Truck getNext() {
		return nextTruck;
	}

	public String toString() {
		String str = " ";
		str = " " + letter;
		return str;
	}

}
