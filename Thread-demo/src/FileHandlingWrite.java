import java.io.FileWriter;

public class FileHandlingWrite {
public static void main(String[] args) {
	
	writefile();
}

private static void writefile() {
	try{    
        FileWriter fw=new FileWriter("input4.txt"); 
      
        fw.write("Welcome to Rakuten.");    
        fw.close();    
       }catch(Exception e){System.out.println(e);}    
       System.out.println("File Successfully written...");    
	
}
}
