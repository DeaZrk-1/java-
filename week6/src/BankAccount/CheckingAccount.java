package BankAccount;

public class  CheckingAccount extends BankAccount {
	private double serviceCharge;

	public CheckingAccount(String accountNum, double balance, double serviceCharge) {
		super(accountNum, balance);
		this.serviceCharge = serviceCharge;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	@Override
	public String toString() {
		return "CheckingAccount [serviceCharge=" + serviceCharge + ", toString()=" + super.toString() + "]";
	}
	public void assesServiceCharge() {
		super.setBalance(super.getBalance()-this.serviceCharge);
	}

}
