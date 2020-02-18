import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library = new ArrayList<Book>();

    public Book getBook(int i) {
      return library.get(i);
    }

    public int getSize() {
      return library.size();
    }

    public void addBook (Book b) {
        library.add(b);
    }

    public void sort() {
        ArrayList.sort(library, Book);
    }

    public void printLibrary() {
        System.out.println(Arrays.toString(library));
    }
}
