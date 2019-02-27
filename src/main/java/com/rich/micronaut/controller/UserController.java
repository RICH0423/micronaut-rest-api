package com.rich.micronaut.controller;

import com.rich.micronaut.model.User;
import com.rich.micronaut.service.UserService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import java.util.List;

@Slf4j
@Controller("/users")
public class UserController {

    @Inject
    private UserService userService;

    @Get
    public List<User> findAllUsers() {
        return userService.getAll();
    }

    @Post
    public String createUser(User user) {
        log.info("Client request data: {}", user);
        return userService.createUser(user.getName());
    }
}
