package com.intuji.assessment.blog.BlogApi.Controller;

import com.intuji.assessment.blog.BlogApi.Exceptions.BlogNotFoundException;
import com.intuji.assessment.blog.BlogApi.Services.BlogService;
import com.intuji.assessment.blog.BlogApi.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/blogs")
public class BlogController {

    //Initializing BlogService
    @Autowired
    private BlogService blogService;


    //Api endpoint to get All blogs
    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlogs(){
       List<Blog> blogList= blogService.getAllBlogs();
       return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    //Api endpoint to get Blog by Id
    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable int id) throws Exception {
        return new ResponseEntity<>(blogService.getBlogById(id),HttpStatus.OK);
    }

    //Api endpoint to post blog
    @PostMapping
    public ResponseEntity<Blog> postBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(blogService.addBlog(blog),HttpStatus.OK);
    }


    //Api endpoint to update blog
    @PutMapping("{id}")
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog,@PathVariable int id) throws BlogNotFoundException {
        return new ResponseEntity<>(blogService.updateBlog(id,blog),HttpStatus.OK);
    }
}
