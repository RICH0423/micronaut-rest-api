package com.rich.micronaut.service;

import com.rich.micronaut.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    void delete(String name);

    String createUser(String name);
}
