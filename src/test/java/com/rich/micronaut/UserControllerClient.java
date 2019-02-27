package com.rich.micronaut;

import com.rich.micronaut.model.User;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client("/users")
public interface UserControllerClient {

    @Get
    List<User> getAllUsers();
}
