package by.epam.lesson9.hometask;

public class ClassicLiterature extends Book{
 private int yearPublished;
public ClassicLiterature (String name, int yearPublished, int price) {
super(name, price);
setName(name);
setPrice(price);
this.yearPublished=yearPublished;
}
public int getYearPublished() {
	return yearPublished;
}
public void setYearPublished(int datePublished) {
	this.yearPublished=yearPublished;
}
@Override
public String toString() {
return "[Classic Literature " + name + ", " + yearPublished + " year" + ", " + price + "$"+"]";
}
}