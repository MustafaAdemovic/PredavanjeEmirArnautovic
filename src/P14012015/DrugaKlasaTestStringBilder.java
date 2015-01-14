package P14012015;

public class DrugaKlasaTestStringBilder {

	public static void main(String[] args) {
		String sum = " ";

		for (int i = 0; i < 100; i++) {

			if (i < 100) {
				sum = sum + i + ", ";
			}
			
		}
		System.out.print("String suma:" + sum);
		System.out.println();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			if (i == 100) {
				sb.append(i);
			} else {
				sb.append(i).append(", ");
			}

		}
		System.out.println("StringBuilder suma: " +sb);
		

		String concatString = " ";
		for (int i = 0; i < 100; i++) {
			if (i < 100) {
				concatString = concatString.concat(i + ", ");
			}
		}
		System.out.println("String concat: " + concatString);

	}

}
