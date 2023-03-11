package exceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try{

			System.out.println("Let's figure out an exception");

			String [] name = {"proSmart", "Java", "Selenium", "Eclipse"};

			System.out.println(name[4]);


			} catch (Exception e) {

				System.out.println("Exception accurred: " + e.getMessage());

				System.out.println("I could handle one!");

			}

			System.out.println("I am out of the catch block");

	}

}
