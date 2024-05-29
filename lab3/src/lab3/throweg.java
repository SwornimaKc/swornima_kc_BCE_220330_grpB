package lab3;

public class throweg {
	public void add(int a) {
		if (a < 30) {
			throw new ArithmeticException();
		}

	}

	public static void main(String[] args) {
		throweg egObj = new throweg();
		try {
			egObj.add(0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("localized message");
			System.out.println(e.getLocalizedMessage());
			System.out.println("get message");
			System.out.println(e.getMessage());
		}
	}

}
