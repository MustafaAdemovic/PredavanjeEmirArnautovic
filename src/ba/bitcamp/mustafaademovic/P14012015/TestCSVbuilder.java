package ba.bitcamp.mustafaademovic.P14012015;

public class TestCSVbuilder {

	public static void main(String[] args) {
		Student a = new Student(3, "Mustaf Ademovic", new Address("Vogosca 21"));

		System.out.println(a.csvBuilder());
	}

}
