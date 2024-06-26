package noThree;

public class MyException {
	
    // Instance variables
    private int firstNumber;
    private int secondNumber;

    // Constructor to initialize the variables
    public MyException() {
        this.firstNumber = 100;
        this.secondNumber = 0;
    }

    // Method to perform division with exception handling
    public void divideNumbers() {
        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Getters and Setters for the instance variables (optional)
    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Main method to test the class
    public static void main(String[] args) {
        MyException myException = new MyException();
        myException.divideNumbers();
    }
}


