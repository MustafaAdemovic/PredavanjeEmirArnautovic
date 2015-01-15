package CSVBuilder;

public class CSVBuilderTest {
	public static void main(String[] args) {

	
		// want to output ,,, 2, 3.4
		CSVBuilder csvBuilder = new CSVBuilder();
		csvBuilder.append(",").append(2).append(3.4);
		System.out.println(csvBuilder);
		// everything is ok
		//we clear now a value of this csvBuilder
		csvBuilder.clear();

		// want to output V1,V2,V3
		// instead of String
		for (int i = 1; i <= 3; i++) {
		
			csvBuilder.append("V" + i);
		

		}
		System.out.println(csvBuilder);
		
		csvBuilder.clear();
		
		// want to output values as int, but one value is double - not reported we must compare from double to int
		//and first member is null
		// by compiler
		double val = 3.0;
		csvBuilder.append(null).append((int)2.3).append((int)val);
		System.out.println(csvBuilder);
	}
}