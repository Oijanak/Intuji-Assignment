package com.intuji.assessment.blog.BlogApi.Services;

import com.intuji.assessment.blog.BlogApi.Exceptions.BlogNotFoundException;
import com.intuji.assessment.blog.BlogApi.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> getAllBlogs();
    Blog getBlogById(int id) throws Exception;

    Blog addBlog(Blog blog);

    Blog updateBlog(int id,Blog blog) throws BlogNotFoundException;

}
