import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String author;
    private ArrayList<Review> reviews =  new ArrayList<Review>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("id = %d name = %s author = %s Reviews = [%s]", id, name, author, reviews);
    }

    public void addReview(Review rev) {
        this.reviews.add(rev);
    }
    public static void main(String[] args){
        Book book = new Book(123, "OOP with Java", "Lucas");
        book.addReview(new Review(1, "Awesome book", 5));
        System.out.println(book);
    }
}
