
public class InnerClassesdemo {

	static class A{
		String name;
		int age;
		Integer aage;
		
	}
	public static void main(String[] args) {
		InnerClassesdemo.A a=new InnerClassesdemo.A();
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.aage);
	}
}
