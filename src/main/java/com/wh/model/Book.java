package com.wh.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

/**
 * @author Wang Hao
 * @since 2022/7/18 11:49
 */
@Repository
@Data
public class Book {
    @Value("${book.id}")
    private Integer id;
    @Value("${book.name}")
    private String name;
    @Value("${book.type}")
    private String type;
}
