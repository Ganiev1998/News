package com.example.project_jsp.service;

import com.example.project_jsp.mapper.CategoryMapper;
import com.example.project_jsp.mapper.NewsMapper;
import com.example.project_jsp.model.Category;
import com.example.project_jsp.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class NewsService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<News> selectAll(){
        return jdbcTemplate.query("select * from news",new NewsMapper());
    }
    public News selectById(Integer id){
        return jdbcTemplate.queryForObject("select * from news where id = ?",new Object[]{id},new NewsMapper());
    }
    public boolean insert(News news){
        jdbcTemplate.update("insert into news(title,content,category_id) values (?,?,?)",news.getTitle(),
                news.getContent(),news.getDate(),news.getCategory_id());
        return true;
    }
    public boolean update(Integer id,News news){
        jdbcTemplate.update("update news set title = ?,content = ?,category_id = ? where id = ?",news.getTitle()
                ,news.getContent(),news.getCategory_id(),id);
        return true;
    }
    public boolean delete(Integer id){
        jdbcTemplate.update("delete from news where id = ?",id);
        return true;
    }
}

