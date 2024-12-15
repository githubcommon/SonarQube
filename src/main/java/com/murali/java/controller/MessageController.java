
package com.murali.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murali.java.service.MessageServiceImpl;

/**
 * @author: Sanapala Muralidharan
 * @date: 14 Dec 2024 12:10:08 pm
 * @version:3.x
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageServiceImpl service;

    @GetMapping("/")
    public String getMessage() {
	return service.getMessage();
    }
}
