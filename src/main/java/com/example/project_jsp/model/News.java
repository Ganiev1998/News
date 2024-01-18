package com.example.project_jsp.model;

import java.util.Date;

public class News {
    private Integer id;
    private String title;
    private String content;
    private Date date;
    private Integer category_id;

    public News(Integer id, String title, String content, Date date, Integer category_id) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.category_id = category_id;
    }

    public News(String title, String content, Date date, Integer category_id) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.category_id = category_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
}
