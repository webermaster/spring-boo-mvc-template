package com.slalom.spring.boot.mvc.template.core.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Created by kevin.weber on 6/28/2017.
 */
@RestController
public class HelloControllerImpl implements HelloController {

    public Map<String, Object> hello(@PathVariable("name") String name) {
        return Collections.singletonMap("greeting", "Hello " + name + "!");
    }
}
