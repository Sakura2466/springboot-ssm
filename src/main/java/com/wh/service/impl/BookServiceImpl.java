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
        return bookMapper.insert(book)>0;
    }

    @Override
    public boolean delete(Long id) {
        return bookMapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean update(Book book) {
        return bookMapper.updateByPrimaryKey(book)>0;
    }

    @Override
    public Book getBookById(Long id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Book> listBooks() {
        return bookMapper.listBooks();
    }

    @Override
    public List<Book> listBooksByName(String name) {
        return bookMapper.listBooksByName(name);
    }
}
