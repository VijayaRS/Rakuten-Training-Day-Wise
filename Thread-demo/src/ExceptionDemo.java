import java.io.IOException;

//runtime exceptions we need to catch
public class ExceptionDemo {

	public static void main(String[] args){
		
       Book book=new Book();
       try {
		book.setPrice(-1000);
	} catch (InvalidPriceException e) {
		
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	}

}
