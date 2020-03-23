package com.wusd.eurekaproducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wusd
 * @date 2020/3/23 17:26
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam("param") String param) {
        return "hello " + param;
    }
}
