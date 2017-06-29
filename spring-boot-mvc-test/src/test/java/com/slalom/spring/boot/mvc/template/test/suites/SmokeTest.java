package com.slalom.spring.boot.mvc.template.test.suites;

import com.slalom.spring.boot.mvc.template.test.categories.Smoke;
import com.slalom.spring.boot.mvc.template.test.config.Config;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

/**
 * Created by kevin.weber on 6/28/2017.
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class, loader = AnnotationConfigContextLoader.class)
public class SmokeTest {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${host}")
    private String host;

    @Test
    @Category(Smoke.class)
    public void healthCheck() {
        assertEquals(HttpStatus.OK, restTemplate.exchange(
                this.host + "/health",
                HttpMethod.GET, null,
                String.class).getStatusCode());
    }

}
