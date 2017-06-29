package com.webermaster.spring.boot.mvc.template.core.controllers;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by kevin.weber on 6/28/2017.
 */
public class HelloControllerImplTest {

    private HelloController underTest = new HelloControllerImpl();

    @Test
    public void helloReturnsProperJson() {
        //act
        Map<String, Object> actual = underTest.hello("World");

        //assert
        assertEquals("Hello World!", actual.get("greeting"));
    }
}
