package dwolf.oop.my_work.constructor.experiments;

public class Book {
    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;

        this.authors = new String[authors.length];

        for (int i = 0; i < authors.length; i++) {
            this.authors[i] = new String(authors[i]);
        }
    }

}
