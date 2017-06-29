package com.slalom.spring.boot.mvc.template.core.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by kevin.weber on 6/28/2017.
 */
public interface HelloController {

    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Map<String, Object> hello(String name);
}
