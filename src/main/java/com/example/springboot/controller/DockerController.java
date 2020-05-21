package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengzi
 * @version V1.0
 * @date 2020/5/19
 * @product_name IntelliJ IDEA
 * @project_name springbootdocker
 * @package_name com.example.springboot.controller
 * @class_name DockerController
 * @description TODO
 */
@RestController
public class DockerController {
    @GetMapping("/")
    public String index(){
        return "Hello SpringBoot Docker,Docker Finished";
    }
}
