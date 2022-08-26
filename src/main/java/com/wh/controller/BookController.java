package com.wh.controller;

import com.wh.model.Book;
import com.wh.model.RespBean;

import com.wh.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * @author Wang Hao
 * @since 2022/7/18 12:48
 */
@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping
    public RespBean save(@RequestBody Book book) {
        boolean save = bookService.save(book);
        if(save){
            log.info("插入成功");
            return RespBean.ok("success");
        }
        return RespBean.error("error");
    }

    @DeleteMapping("/{id}")
    public RespBean delete(@PathVariable Long id){
        boolean delete = bookService.delete(id);
        if(delete){
            log.info("删除成功");
            return RespBean.ok("success");
        }
        return RespBean.error("error");
    }

    @PutMapping
    public RespBean update(@RequestBody Book book) {
        boolean update = bookService.update(book);
        if (update){
            log.info("更新成功");
            return RespBean.ok("success");
        }
        return RespBean.error("error");
    }

    @GetMapping("/{id}")
    public RespBean<Book> getBookById(@PathVariable Long id) {
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
            log.info("查询成功");
            return RespBean.ok("success",books);
        }
        return RespBean.error("error");
    }

    @GetMapping("/listByName")
    public RespBean<List<Book>> getByName(String name){
        List<Book> books = bookService.listBooksByName(name);
        if(books!=null){
            log.info("按名称查询成功");
            return RespBean.ok("success", books);
        }
        return RespBean.error("error");
    }

}
