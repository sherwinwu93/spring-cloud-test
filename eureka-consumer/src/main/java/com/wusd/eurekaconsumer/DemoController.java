package com.wusd.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wusd
 * @date 2020/3/23 17:35
 */
@RestController
public class DemoController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/greet")
    public String hello(@RequestParam("name") String name) {
        return restTemplate.getForObject("http://EUREKA-PRODUCER/hello?param=" + name, String.class);
    }
}
