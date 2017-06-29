package com.slalom.spring.boot.mvc.template.test.util;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Base64;

/**
 * Created by kevin.weber on 6/29/2017.
 */
public class HeadersFactory {

    private String username;
    private String password;

     public HeadersFactory(String username, String password) {
         this.username = username;
         this.password = password;
     }

     public MultiValueMap<String, String> getHeaders() {
         MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
         String encoded = Base64.getEncoder().encodeToString((this.username + ":" + this.password).getBytes());
         headers.add("Authorization", "Basic " + encoded);
         return headers;
     }
}
