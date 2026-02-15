package Lab04_Tasks;

public class LibraryBook {
    public String title;
    public double price;

    LibraryBook(){
        this.title = "Unknown";
        this.price = 0.0;
    }

    LibraryBook(String Ptitle){
        this.title = Ptitle;
        this.price = 500;
    }

    LibraryBook(String Ptitle, double Pprice){
        this.title = Ptitle;
        this.price = Pprice;
    }

    public void displayInformation(){
        System.out.println("Book Title : " + this.title);
        System.out.println("Book Price : " + this.price);
    }

    public static void main(String[] args){
        LibraryBook book1 = new LibraryBook();
        LibraryBook book2 = new LibraryBook("ABC");
        LibraryBook book3 = new LibraryBook("123", 1000);
        book1.displayInformation();
        book2.displayInformation();
        book3.displayInformation();
    }
}
