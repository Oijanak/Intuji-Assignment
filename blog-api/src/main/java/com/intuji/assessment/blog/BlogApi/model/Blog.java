package com.intuji.assessment.blog.BlogApi.model;

import jakarta.persistence.*;



@Entity
public class Blog  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int blog_id;

    private String title;
    private String description;

    private String category;
    public Blog(){

    }

    public Blog(int blog_id, String title, String description, String category) {
        this.blog_id = blog_id;
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
