package com.example.project_jsp.service;

import com.example.project_jsp.mapper.CategoryMapper;
import com.example.project_jsp.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class CategoryService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Category> selectAll(){
        return jdbcTemplate.query("select * from news_category",new CategoryMapper());
    }
    public Category selectById(Integer id){
        return jdbcTemplate.queryForObject("select * from news_category where id = ?",new Object[]{id},new CategoryMapper());
    }
    public boolean insert(Category category){
        jdbcTemplate.update("insert into news_category(name) values (?)",category.getName());
        return true;
    }
    public boolean update(Integer id,Category category){
        jdbcTemplate.update("update news_category set name = ? where id = ?",category.getName(),id);
        return true;
    }
    public boolean delete(Integer id){
        jdbcTemplate.update("delete from news_category where id = ?",id);
        return true;
    }
}
