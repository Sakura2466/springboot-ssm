package com.wh.mapper;

import com.wh.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Wang Hao
 * @since 2022/7/18 11:49
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
