package P14012015;

public class CSVBuilder {

	public String string;

	public CSVBuilder append(String str) {

		if (string != null) {
			string += ", " + str;
		} else {
			string = str;
		}
		return this;

	}

	public String toString() {

		return string;

	}
}
