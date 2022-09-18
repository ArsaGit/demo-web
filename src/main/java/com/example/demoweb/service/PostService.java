package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> postsList = new ArrayList<>();
        postsList.add(new Post("First post", new Date()));
        postsList.add(new Post("Second post", new Date()));
        postsList.add(new Post("Third post", new Date()));

        return postsList;
    }
}
