public class Book {

    String author;
    String title;
    int year;

    public Book (String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Object other) {
        if (other == null){
            return false;
        }
        return (author==other.author && title==other.title && year==other.title);
    }

    public String toString() {
        return author + " " + title + " " + Integer.toString(year);
    }
}
