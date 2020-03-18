import java.util.ArrayList;

public class Library {
    private Object book;
    private String name;
    private ArrayList<Book> collection;

    public Library(String name) {
        this.book = book
        this.name = name;
        this.collection = ArrayList<Book> collection;


        public Library(String name){
            this.name = name;
            this.collection = new ArrayList<Book>();
        }

        public int bookAudit(){
            return collection.size();
        }

        public void addBook(Book book){
            collection.add(book);
        }

        public void checkStock(){
            if (this.collection.size() >= 10){
                return true
            } else{
                return false
            }
        }
    }
}
