package com.guizeraxD.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guizeraxD.workshopmongo.domain.Post;
import com.guizeraxD.workshopmongo.repository.PostRepository;
import com.guizeraxD.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
    public Post findById(String id) {
        Optional<Post> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
    }	
}
