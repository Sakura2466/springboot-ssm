package com.wh.service.impl;

import com.wh.mapper.BookMapper;
import com.wh.model.Book;
import com.wh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wang Hao
 * @since 2022/7/18 12:39
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public boolean save(Book book) {
        return bookMapper.save(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookMapper.delete(id)>0;
    }

    @Override
    public boolean update(Book book) {
        return bookMapper.update(book)>0;
    }

    @Override
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public List<Book> listBooks() {
        return bookMapper.listBooks();
    }
}
