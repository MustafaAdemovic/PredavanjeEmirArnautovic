package ba.bitcamp.mustafaademovic.P21012015;

import java.io.File;
import java.io.IOException;

public class TestWriteFile {

	public static void main(String[] args) {
		WriteFile file = new WriteFile();
		/**
		 * Test ispisivanje podatka iz fajla na konzolu
		 */
		try {
			file.fileToSysout(new File("input"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * Test ispisivanja podataka iz jednog fajla u drugi
		 */
		try {
			file.copyToFile(new File("input"), new File("output"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

