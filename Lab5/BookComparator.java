import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    // Implement the comparator method for books.
    public int compare(Book a , Book b){
        if (a == null || b== null){
            throw new NullPointerException();
        }

        int res =0;

        if (a.getAuthor() == null && b.getAuthor()!= null){
            res = -1;
        }
        else if (b.getAuthor() == null) res = 1;
        else res = a.getAuthor().compareTo(b.getAuthor() );
        if (res!=0) return res;

        if (a.getTitle() == null && b.getTitle() != null){
            res = -1;
        }
        else if (b.getTitle() == null) res = 1;
        else res = a.getTitle().compareTo(b.getTitle() );
        if (res!=0) return res;

        if (a.getYear() < b.getYear() ){
            return -1;
        }
        else if( a.getYear() == b.getYear()){
            return 0;
        }else return 1;
    }

}
