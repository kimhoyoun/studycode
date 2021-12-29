package day1229.org.homework;
class Pencil{
	private int amount;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}

class SarpPenccil extends Pencil{
	private int width;
}

class BallPen extends Pencil{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

class FountainPen extends Pencil{
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void refill(int n) {
		setAmount(n);
	}
}

