package by.epam.lesson9.hometask;

public class Main {
public static void main(String[] args) {
	Book anyBook=new ClassicLiterature("Harry Potter", 2007, 105);
	System.out.println (anyBook.toString());
	ElectronicBook anyelectronicbook = new ElectronicBook("Windows for Dummies", "pdf", 0);
	System.out.println (anyelectronicbook.toString());
    ElectronicBook map=new ElectronicMap ("Belarus", "Minsk", "nm2", 5);
    System.out.println (map.toString());
    Newspaper anynewspaper = new Newspaper("Times", 5, "24/06/2018");
    System.out.println(anynewspaper.toString());
}
}
