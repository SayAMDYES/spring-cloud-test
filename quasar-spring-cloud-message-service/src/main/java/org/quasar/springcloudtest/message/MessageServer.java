package org.quasar.springcloudtest.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Quasar
 * @version 1.0.0
 * @date 2021/6/13 14:52
 */
@SpringBootApplication(exclude = {GsonAutoConfiguration.class})
@EnableEurekaClient
public class MessageServer {
    public static void main(String[] args) {
        SpringApplication.run(MessageServer.class,args);
    }
}
