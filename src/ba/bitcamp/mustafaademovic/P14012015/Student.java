package ba.bitcamp.mustafaademovic.P14012015;

public class Student {

	private int id;
	private String name;
	private Address address;

	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public CSVBuilder csvBuilder() {
		CSVBuilder csv = new CSVBuilder();
		return csv.append(String.valueOf(id)).append(name).append(address.toString());
	}

}
