package com.wh.service;

import com.wh.model.Book;

import java.util.List;

/**
 * @author Wang Hao
 * @since 2022/7/18 12:43
 */
public interface BookService {

    boolean save(Book book);

    boolean delete(Integer id);

    boolean update(Book book);

    Book getBookById(Integer id);

    List<Book> listBooks();
}
