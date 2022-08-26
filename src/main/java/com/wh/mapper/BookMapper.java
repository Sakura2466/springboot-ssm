package com.wh.mapper;

import com.wh.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author hjly
* @description 针对表【book】的数据库操作Mapper
* @createDate 2022-08-22 12:15:08
* @Entity com.wh.model.Book
*/
@Mapper
public interface BookMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> listBooks();

    List<Book> listBooksByName(String name);

}
