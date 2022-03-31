import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		readfile();
	}

	private static void readfile() throws IOException {
		FileReader reader=new FileReader("input.txt");
		BufferedReader bufferedReader=new BufferedReader(reader);
	
		//String line=bufferedReader.readLine();
		
	    //System.out.println(line);
        Stream<String> stream = bufferedReader.lines();
        stream.forEach((line) -> System.out.println(line));
    }

	    

}
