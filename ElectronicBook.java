package by.epam.lesson9.hometask;

public class ElectronicBook extends Book{
protected String format;
public ElectronicBook (String name, String format, int price) {
	super(name, price);
	setName(name);
	setPrice(price);
	this.format=format;
}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format=format;
	}
	@Override
	public String toString() {
		return "[Electronic Book " + name + ", " + format + ", " + price + "$"+"]";
	}
	}
	class ElectronicMap extends ElectronicBook{
		private String city;
		public ElectronicMap(String name, String city, String format, int price) {
			super(name, format, price);
			setName(name);
			setPrice(price);
			setFormat(format);
			this.city=city;
		}
	private String getCity() {
		return city;
}
	@Override
	public String toString() {
		return "[Electronic Map " + name + " for city of " + city + ", " + format + ", "+ price + "$"+"]";
	}

}
	
