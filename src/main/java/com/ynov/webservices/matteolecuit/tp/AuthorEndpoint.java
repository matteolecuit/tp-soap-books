package com.ynov.webservices.matteolecuit.tp;

import lecuit.matteo.ws.author.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Optional;

public class AuthorEndpoint {

    @Autowired
    private AuthorService authorService;

    private static final String NAMESPACE_URI = "http://matteo.lecuit/ws/author";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAuthorById")
    @ResponsePayload
    public GetAuthorByIdResponse getAuthorById(@RequestPayload GetAuthorByIdRequest request){
        GetAuthorByIdResponse getAuthorResponse = new GetAuthorByIdResponse();
        Optional<Author> authorOpt = authorService.findById(request.getId());
        if(authorOpt.isPresent()) {
            getAuthorResponse.setAuthor(authorOpt.get());
        }
        return  getAuthorResponse;
    }

}
