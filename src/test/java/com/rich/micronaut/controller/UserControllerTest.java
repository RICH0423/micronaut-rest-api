package com.rich.micronaut.controller;

import com.rich.micronaut.UserControllerClient;
import com.rich.micronaut.model.User;
import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserControllerTest {

    private EmbeddedServer server;
    private UserControllerClient client;

    @Before
    public void setup() {
        this.server = ApplicationContext.run(EmbeddedServer.class);
        this.client = server.getApplicationContext().getBean(UserControllerClient.class);
    }

    @After
    public void cleanup() {
        this.server.stop();
    }

    @Test
    public void findAllUsers() {
        List<User> users = client.getAllUsers();
        assertEquals(users.size(), 2);
    }
}