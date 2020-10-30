package com.ynov.webservices.matteolecuit.tp;

import lecuit.matteo.ws.author.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepository extends JpaRepository<Author, String> {
}
