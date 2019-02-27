package com.rich.micronaut.service;

import com.rich.micronaut.model.User;
import io.micronaut.context.annotation.Primary;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Primary
@Singleton
public class UserServiceImpl implements UserService {

    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(UUID.randomUUID().toString(), "rich", "rich.lee@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(), "rich", "rich.lee@gmail.com"));
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public void delete(String name) {

    }

    @Override
    public String createUser(String name) {
        String id = UUID.randomUUID().toString();
        userList.add(new User(id, name, ""));
        return id;
    }
}
