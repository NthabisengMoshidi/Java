abstract class LibraryItem {
    private String title;
    private String location;
    private boolean availability;

    public LibraryItem(String title, String location, boolean availability) {
        this.title = title;
        this.location = location;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    abstract void display_info();
}


class Book extends LibraryItem {
    private String author;

    public Book(String title, String location, boolean availability, String author) {
        super(title, location, availability);
        this.author = author;
    }

 @Override
  public void display_info() {
        System.out.println("Title: " + getTitle());
        System.out.println("Location: " + getLocation());
        System.out.println("Availability: " + (isAvailable() ? "Available" : "Not Available"));
        System.out.println("Author: " + author);
    }
}


class DVD extends LibraryItem {
    private int runtime;

    public DVD(String title, String location, boolean availability, int runtime) {
        super(title, location, availability);
        this.runtime = runtime;
    }

 @Override
  public void display_info() {
        System.out.println("Title: " + getTitle());
        System.out.println("Location: " + getLocation());
        System.out.println("Availability: " + (isAvailable() ? "Available" : "Not Available"));
        System.out.println("Runtime: " + runtime + " minutes");
    }
}

public class Main {
public static void main(String[] args) {
        
        Book book = new Book("The Great Gatsby", "Fiction", true, "F. Scott Fitzgerald");
        DVD dvd = new DVD("The Matrix", "Sci-Fi", false, 136);

        System.out.println();
        book.display_info();
        System.out.println();
        dvd.display_info();
    }
}