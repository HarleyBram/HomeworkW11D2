import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

    public class LIbraryTest{
        private Library library;
        private Book book;

        @Before
        public void before(){
            library = new Library("Glasgow Library");
            book = new Book("Das Kapital", "Karl Marx", "Economics");
        }

    }
}
