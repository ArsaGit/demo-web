package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.LongConsumer;

@Service
public class PostService {
    private List<Post> posts;
    @Autowired
    PostRepository postRepository;

    public PostService(){
        posts = new ArrayList<>();
        posts.add(new Post(0L,"пост 1", new Date()));
        posts.add(new Post(1L,"пост 2", new Date()));
        posts.add(new Post(2L,"пост 3", new Date()));
    }

    /*public List<Post> listAllPosts() {
        return posts;
    }*/
    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text) {
        long newId = posts.size();
        posts.add(new Post(newId, text, new Date()));
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
