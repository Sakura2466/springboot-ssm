package com.wh.controller;

import com.wh.model.Book;
import com.wh.model.RespBean;
import com.wh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Wang Hao
 * @since 2022/7/18 12:48
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping
    public RespBean save(@RequestBody Book book) {
        boolean save = bookService.save(book);
        if(save){
            return RespBean.ok("success");
        }
        return RespBean.error("error");
    }

    @DeleteMapping("/{id}")
    public RespBean delete(@PathVariable Integer id){
        boolean delete = bookService.delete(id);
        if(delete){
            return RespBean.ok("success");
        }
        return RespBean.error("error");
    }

    @PutMapping
    public RespBean update(@RequestBody Book book) {
        boolean update = bookService.update(book);
        if (update){
            return RespBean.ok("success");
        }
        return RespBean.error("error");
    }

    @GetMapping("/{id}")
    public RespBean getBookById(@PathVariable Integer id) {
        Book bookById = bookService.getBookById(id);
        if (bookById != null) {
            return RespBean.ok("success",bookById);
        }
        return RespBean.error("error");
    }

    @GetMapping
    public RespBean listBooks(){
        List<Book> books = bookService.listBooks();
        if (books != null) {
            return RespBean.ok("success",books);
        }
        return RespBean.error("error");
    }

}
