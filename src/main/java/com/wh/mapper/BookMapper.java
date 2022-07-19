package com.wh.mapper;

import com.wh.model.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Wang Hao
 * @since 2022/7/18 12:00
 */
@Mapper
public interface BookMapper {
    @Insert("insert into book(name,type) values(#{name},#{type})")
    int save(Book book);
    @Delete("delete from book where id=#{id}")
    int delete(Integer id);
    @Update("update book set name=#{name},type=#{type} where id=#{id}")
    int update(Book book);
    @Select("select * from book where id=#{id}")
    Book getBookById(Integer id);
    @Select("select * from book")
    List<Book> listBooks();
}
