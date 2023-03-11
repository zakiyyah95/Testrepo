package encapsulation;

public class ATM {
	
	public static void main(String[] args) {
		
		Bank obj = new Bank();
		//obj.pinNumber = 5678;
		obj.updatePin(12345678, 1234, 6754);
		obj.drawMoney(12345678, 5678, 1000);
	}

}
