package ba.bitcamp.mustafaademovic.P07012015;
public class Sing {

	public static void main(String[] args) {

		Truck[] alphabet = new Truck[28];
		Engine eng = new Engine("Alphabet");
		Train abc = new Train(eng);

		int alphabetCharNumber = 65;

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = new Truck((char) alphabetCharNumber);
			alphabetCharNumber++;
		}

		eng.setFirstTruck(alphabet[0]);
		for (int i = 1; i < alphabet.length; i++) {
			alphabet[i - 1].setTruck(alphabet[i]);
		}
		sing(abc);

	}

	public static void sing(Train abc) {
		Truck current = abc.getEngine().getFirstTruck();

		while (current != null) {
			System.out.print(current.toString() + "");
			current = current.getNext();
		}
	}

}
