package com.twu.biblioteca;

import java.util.List;

/**
 * Created by jpaukows on 9/24/14.
 */
public class ConsoleView {
    private boolean showingWelcomeMessage = false;
    private boolean showingBookList = false;

    public void showWelcomeMessage() {
        System.out.println("Welcome!!!");
        showingWelcomeMessage = true;
    }

    public boolean isShowingWelcomeMessage() {
        return showingWelcomeMessage;
    }

    public boolean isShowingBookList() {
        return showingBookList;
    }

    public void setShowingBookList(boolean showingBookList) {
        this.showingBookList = showingBookList;
    }

    public void showBookList(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
        showingBookList = true;
    }
}
