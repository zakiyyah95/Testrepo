package encapsulation;

public class Bank {
	
	int accountNumber = 12345678;
	private int pinNumber = 1234; /// default access modifier 
	private int balance = 150000;
	
	public void drawMoney(int acctNo, int pinNo, int amount) {
		
		if(acctNo == accountNumber && pinNo == pinNumber) {
			
			if(amount <= balance ) {
				balance = balance - amount;
				System.out.print("Amount withdraw : "+ amount);
			} else {
				System.out.print("Insufficient funds");
				
			}
			
			
		}else {
			
			System.out.print("Invalid credentials");
		}
		
	}
	
	public void updatePin(int accountNo, int oldPin, int newPin) {
		
		if(accountNo == accountNumber && oldPin == pinNumber) {
			pinNumber = newPin;
			System.out.print("Pin has been updated");
			
		}else {
			System.out.print("Invalid credentials");
		}
		
	}/// encapsulation wraps the data functions and allows the user to access it by only using the functions

	public int getPinNumber() {  //// the GET and SET keywords refers back to the global variables
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

}
