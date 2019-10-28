
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class Library {

    private ArrayList<Book> list;

    public Library() {
        this.list = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.list.add(newBook);
    }

    public void printBooks() {
        for (Book book : this.list) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {

        ArrayList<Book> titlesList = new ArrayList<Book>();

        for (Book book : this.list) {
            if (StringUtils.included(book.title(), title)) {
                titlesList.add(book);
            }
        }
        return titlesList;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {

        ArrayList<Book> publishersList = new ArrayList<Book>();

        for (Book book : this.list) {
            if (StringUtils.included(book.publisher(), publisher)) {
                publishersList.add(book);
            }
        }
        return publishersList;

    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> yearsList = new ArrayList<Book>();

        for (Book book : this.list) {
            if (book.year() == year) {
                yearsList.add(book);
            }
        }
        return yearsList;
    }
}
