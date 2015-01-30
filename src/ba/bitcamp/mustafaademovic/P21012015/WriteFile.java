package ba.bitcamp.mustafaademovic.P21012015;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class WriteFile {

	/**
	 * Metoda za ispisivanje podataka iz fajla na konzolu
	 * 
	 * @param file
	 * @throws IOException
	 */
	public static void fileToSysout(File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = null;
		file = new File("file_path");
		System.out.println(file.length());
		try {
			InputStreamReader isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} finally {
			if (br != null) {
				br.close();
			}
			fis.close();
			System.out.println("Gotovo!!");
		}
	}

	/**
	 * Metoda za prepisivanje iz jednog fajla u drugi
	 */

	public static void copyToFile(File input, File output) throws IOException {
		FileInputStream fis = new FileInputStream(input);
		FileOutputStream fos = new FileOutputStream(output);
		BufferedReader br = null;
		try {
			InputStreamReader isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			OutputStream os = new DataOutputStream(fos);
			String line = "";
			while ((line = br.readLine()) != null) {
				fos.write(line.getBytes());
				fos.write("\n".getBytes());
			}

		} catch (IOException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				br.close();
			}
			fis.close();
			fos.close();
			System.out.println("Program is finished!!");
		}
	}

}
