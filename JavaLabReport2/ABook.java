/*13.	[Abstract Class] Suppose a library system that records the books that have been borrowed. There are three kinds of books: regular books, reference books, and audio books. Reference books can be taken out for just two days, while other kinds of books may be borrowed for two weeks. The overdue fees are 10 cents per day for reference books and regular books, and 20 cents per day for audio books. Audio books and regular books have authors and titles and the date book has taken; reference books have titles and the date book has taken.

●	Define the abstract class ABook and lift those fields that can be lifted to this class.
 
●	Design the method daysOverdue that consumes the number that represents today in the library date-recording system and produces the number of days this book is overdue. If the number is negative, the book can still be out for that many days.
●	Design the method isOverdue that produces a boolean value that informs us whether the book is overdue on the given day.
●	Design the method computeFine that computes the fine for this book, if the book is returned on the given day.*/
package JavaLabReport2;
import java.time.LocalDate;

public abstract class ABook {
    protected String title;
    protected LocalDate dateTaken;

    public ABook(String title, LocalDate dateTaken) {
        this.title = title;
        this.dateTaken = dateTaken;
    }

    public abstract int daysOverdue(LocalDate currentDate);

    public abstract boolean isOverdue(LocalDate currentDate);

    public abstract double computeFine(LocalDate returnDate);
}

class RegularBook extends ABook {
    private String author;

    public RegularBook(String title, String author, LocalDate dateTaken) {
        super(title, dateTaken);
        this.author = author;
    }

    public int daysOverdue(LocalDate currentDate) {
        return (int) (currentDate.toEpochDay() - dateTaken.toEpochDay() - 14);
    }

    public boolean isOverdue(LocalDate currentDate) {
        return daysOverdue(currentDate) > 0;
    }

    public double computeFine(LocalDate returnDate) {
        int overdueDays = daysOverdue(returnDate);
        return Math.max(0, overdueDays) * 0.10;
    }
}

class ReferenceBook extends ABook {
    public ReferenceBook(String title, LocalDate dateTaken) {
        super(title, dateTaken);
    }

    public int daysOverdue(LocalDate currentDate) {
        return (int) (currentDate.toEpochDay() - dateTaken.toEpochDay() - 2);
    }

    public boolean isOverdue(LocalDate currentDate) {
        return daysOverdue(currentDate) > 0;
    }

    public double computeFine(LocalDate returnDate) {
        int overdueDays = daysOverdue(returnDate);
        return Math.max(0, overdueDays) * 0.10;
    }
}

class AudioBook extends ABook {
    private String author;

    public AudioBook(String title, String author, LocalDate dateTaken) {
        super(title, dateTaken);
        this.author = author;
    }

    public int daysOverdue(LocalDate currentDate) {
        return (int) (currentDate.toEpochDay() - dateTaken.toEpochDay() - 14);
    }

    public boolean isOverdue(LocalDate currentDate) {
        return daysOverdue(currentDate) > 0;
    }

    public double computeFine(LocalDate returnDate) {
        int overdueDays = daysOverdue(returnDate);
        return Math.max(0, overdueDays) * 0.20;
    }
}

class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateTaken = LocalDate.of(2023, 6, 1);

        RegularBook regularBook = new RegularBook("The Great Gatsby", "F. Scott Fitzgerald", dateTaken);
        ReferenceBook referenceBook = new ReferenceBook("Java Programming", dateTaken);
        AudioBook audioBook = new AudioBook("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", dateTaken);

        System.out.println("Regular Book Overdue: " + regularBook.isOverdue(currentDate));
        System.out.println("Regular Book Fine: $" + regularBook.computeFine(currentDate));

        System.out.println("Reference Book Overdue: " + referenceBook.isOverdue(currentDate));
        System.out.println("Reference Book Fine: $" + referenceBook.computeFine(currentDate));

        System.out.println("Audio Book Overdue: " + audioBook.isOverdue(currentDate));
        System.out.println("Audio Book Fine: $" + audioBook.computeFine(currentDate));
    }
}
