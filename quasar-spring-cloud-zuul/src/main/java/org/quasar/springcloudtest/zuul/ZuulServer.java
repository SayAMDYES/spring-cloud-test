package org.quasar.springcloudtest.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Quasar
 * @version 1.0.0
 * @date 2021/6/12 22:05
 */
@SpringBootApplication(exclude = {GsonAutoConfiguration.class})
@EnableZuulProxy
@EnableEurekaClient
public class ZuulServer {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer.class, args);
    }
}
