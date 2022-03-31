//to make resuable for fifferent files.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class FileHDemo {

	public static void main(String[] args) {

		readfile("input.txt");
		readfile("input1.txt");

	}

	private static void readfile(String filename) {
		
		   File file = new File(filename);

	        try (BufferedReader br = new BufferedReader(new FileReader(file)))

	        {
	            String line;

	            while ((line = br.readLine()) != null) {

	                System.out.println(line);

	            }

	        } catch (IOException e) {

	            e.printStackTrace();

	        }
	}

}
