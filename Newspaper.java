package by.epam.lesson9.hometask;

public class Newspaper extends Book {
	private String date;
	public Newspaper (String name,int price, String date) {
		super(name, price);
		setName(name);
		setPrice(price);
		this.date=date;
	}
	public String getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "[Newspaper " + name + ", Date: " + date + ", " + price + "$"+"]";
	}

}
