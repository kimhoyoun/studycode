package day1229.org.receipt.model;

public class ReceiptVo {
	
	private int no;
	private String menu;
	private int money;
	
	public ReceiptVo() {
		this(0,"",0);
	}

	public ReceiptVo(int no, String menu, int money) {
		this.no = no;
		this.menu = menu;
		this.money = money;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return no + "\t" + String.format("%-10s", menu) + "\t" + String.format("%-10s",money)+"원";
	}

	
}
