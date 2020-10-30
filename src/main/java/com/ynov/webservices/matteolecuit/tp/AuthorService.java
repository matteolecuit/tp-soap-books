package com.ynov.webservices.matteolecuit.tp;

import lecuit.matteo.ws.author.Author;

import java.util.List;
import java.util.Optional;

public class AuthorService {

    private IAuthorRepository authorRepository;

    public List<Author> findAll() {return  authorRepository.findAll();}

    public Optional<Author> findById(String id) { return  authorRepository.findById(id);}

}
