package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> postsList = new ArrayList<>();
        postsList.add(new Post("First post"));
        postsList.add(new Post("Second post"));
        postsList.add(new Post("Third post"));

        return postsList;
    }
}
