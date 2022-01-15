package lamda.example.second;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks() {
        List<Book> books= new ArrayList<>();
        books.add(new Book(101,"test01",234));
        books.add(new Book(102,"test02",232));
        books.add(new Book(103,"test03",235));
        books.add(new Book(104,"test04",222));

        return books;
    }
}
