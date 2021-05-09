package week9.vo;

public class Result {
	private int saleNumber;
	private int saleCount;
	private float saleTotalMoney;
//	
	public Result(int saleNumber, int saleCount, float saleTotalMoney) {
		super();
		this.saleNumber = saleNumber;
		this.saleCount = saleCount;
		this.saleTotalMoney = saleTotalMoney;
	}
	
	public Result() {
	super();
}

	public int getSaleNumber() {
		return saleNumber;
	}
	public void setSaleNumber(int saleNumber) {
		this.saleNumber = saleNumber;
	}
	public int getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}
	public float getSaleTotalMoney() {
		return saleTotalMoney;
	}
	public void setSaleTotalMoney(float saleTotalMoney) {
		this.saleTotalMoney = saleTotalMoney;
	}
	@Override
	public String toString() {
		return "Result [saleNumber=" + saleNumber + ", saleCount=" + saleCount + ", saleTotalMoney=" + saleTotalMoney
				+ "]";
	}
	

}
