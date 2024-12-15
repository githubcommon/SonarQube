package com.murali.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.murali.java.controller.MessageController;

@SpringBootTest
class SpringbootSonarqubedemoApplicationTests {

    @Autowired
    private MessageController controller;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetMessage() {
	String message = controller.getMessage();
	Assertions.assertNotNull(message);
    }
}
