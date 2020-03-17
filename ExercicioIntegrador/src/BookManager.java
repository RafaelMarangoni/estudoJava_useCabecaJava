import java.util.List;

public class BookManager {

    private List<Book> bookregistered;

    public void RegisterBook(Book newBook){
        bookregistered.add(newBook);
        System.out.println(newBook + "registrado com sucesso");
    }

    public void searchBook(){}
}
