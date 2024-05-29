package lab3;

public class exc {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
	try {	
		int result = a / b;
	}catch(Exception exception ) {
		System.out.println("localized message");
		System.out.println(exception.getLocalizedMessage());
		System.out.println("get message");
		System.out.println(exception.getMessage());
		System.out.println("get clause");
		System.out.println(exception.getCause());
	}
		

	}

}
