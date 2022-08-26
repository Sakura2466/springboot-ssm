package com.wh.service;


import com.wh.model.Book;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wang Hao
 * @since 2022/8/22 12:15
 */

public interface BookService {
    boolean save(Book book);
    boolean delete(Long id);
    boolean update(Book book);
    Book getBookById(Long id);
    List<Book> listBooks();
    List<Book> listBooksByName(String name);


}
