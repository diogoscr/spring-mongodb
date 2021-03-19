package com.diogoscr.springmongo.services;

import com.diogoscr.springmongo.domain.Post;
import com.diogoscr.springmongo.domain.User;

import com.diogoscr.springmongo.repository.PostRepository;

import com.diogoscr.springmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}