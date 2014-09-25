package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ControllerTest {

    private Controller controller;

    @Before
    public void setUp() throws Exception {
        controller = new Controller();
        Book first = new Book();
        Book second = new Book();
        List<Book> books = new ArrayList<Book>();
        books.add(first);
        books.add(second);
        controller.setBooks(books);

        controller.initialize();
    }

    @Test
    public void showsWelcomingMessageWhenApplicationStarts() {
        assertEquals(true, controller.getView().isShowingWelcomeMessage());
    }

    @Test
    public void showsListOfBooksWhenWelcomingMessageIsDisplayed() {
        assertEquals(true, controller.getView().isShowingBookList());
    }

    @Test
    public void showsListOfPossibleCommandsWhenWelcomingMessageIsDisplayed() {
        assertEquals(true, controller.getView().isShowingMenu());
    }
}
