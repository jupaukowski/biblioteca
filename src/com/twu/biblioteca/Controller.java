package com.twu.biblioteca;


import java.util.List;

public class Controller {

    private ConsoleView view = new ConsoleView();
    private List<Book> books;

    public void initialize() {
        this.view.showWelcomeMessage();
        this.view.showBookList(books);
    }

    public ConsoleView getView() {
        return view;
    }

    public void setView(ConsoleView view) {
        this.view = view;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }
}
