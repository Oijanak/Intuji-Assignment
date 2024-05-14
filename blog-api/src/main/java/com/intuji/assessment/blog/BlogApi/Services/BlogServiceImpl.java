package com.intuji.assessment.blog.BlogApi.Services;

import com.intuji.assessment.blog.BlogApi.Exceptions.BlogNotFoundException;
import com.intuji.assessment.blog.BlogApi.Repository.BlogRepository;
import com.intuji.assessment.blog.BlogApi.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public List<Blog> getAllBlogs() {
        //Returning all blogs present in database
        return blogRepository.findAll();
    }

    @Override
    public Blog getBlogById(int id) throws Exception {
        //Checking if blog with given id  is present or not
        Optional<Blog> blog=blogRepository.findById(id);
        if(blog.isPresent()){
            //Returning if present
            return blog.get();
        }
        else{
            //throwing BlogNotFoundException if blog with given id is not present
            throw new BlogNotFoundException(id);
        }


    }

    @Override
    public Blog addBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog updateBlog(int id,Blog blog) throws BlogNotFoundException {
        Optional<Blog> checkBlog = blogRepository.findById(id);
        //Checking if blog with given id to update is present or not
        if (checkBlog.isPresent()) {
            Blog updateBlog=checkBlog.get();

            //Updating category if available
            if(blog.getCategory()!=null){
                updateBlog.setCategory(blog.getCategory());
            }
            //Updating description if available
           if(blog.getDescription()!=null){
               updateBlog.setDescription(blog.getDescription());
           }
            //Updating title if available
           if(blog.getTitle()!=null){
               updateBlog.setTitle(blog.getTitle());
           }

           //Updating and returning updated blog
            return blogRepository.save(updateBlog);
        }


        else{
            //Throwing blog not found exception if blog with given id is not present
            throw new BlogNotFoundException(id);
        }

    }
}
