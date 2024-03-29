package com.zhzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jason.zhao
 * @date:2019/4/11 14:50
 * @Description:
 */

@SpringBootApplication
@ComponentScan("com.zhzh")
public class ImageAiApplication {


    public static void main(String[] args) {
        SpringApplication.run(ImageAiApplication.class, args);
    }
}