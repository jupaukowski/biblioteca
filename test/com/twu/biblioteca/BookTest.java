package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void returnsPropertiesInColumnFormat() throws Exception {
        Book book = new Book();
        String title = "Os Irmaos Karamasov";
        book.setTitle(title);
        String author = "Fiodor Mikhailovich Dostoievsky";
        book.setAuthor(author);
        Integer year = 1880;
        book.setYear(year);

        String propertiesInColumnFormat = book.getPropertiesInColumnFormat();
        String expectedPropertiesInColumnFormat = "Os Irmaos Karamasov | Fiodor Mikhailovich Dostoievsky | 1880";

        assertEquals(expectedPropertiesInColumnFormat, propertiesInColumnFormat);
    }
}