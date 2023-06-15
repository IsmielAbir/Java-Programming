/*10.	Design a Book class that holds the title, author’s name, and price of the book. Books’s constructor should initialize all of these data members except the price which is set to 500/-. Create a display method that displays all fields. All Books are priced at 500/- unless they are PopularBooks. The PopularBooks subclass replaces the Book Price and sets each Book’s price to 50,000/- through PopularBooks constructor. Override the display method to display all fields.*/

package JavaLabReport;
public class MainBook {
    
    public class Book {
        public String title;
        public String authorName;
        public int price;

        public Book(String title, String authorName) {
            this.title = title;
            this.authorName = authorName;
            this.price = 500;
        }

        public void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + authorName);
            System.out.println("Price: " + price + "/-");
        }
    }

    public class PopularBook extends Book {
        public PopularBook(String title, String authorName) {
            super(title, authorName);
            this.price = 50000;
        }

        @Override
        public void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + authorName);
            System.out.println("Price: " + price + "/- (Popular)");
        }
    }
}
