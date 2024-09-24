package com.example.swagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("test")
@Tag(name = "测试管理", description = "用于测试相关")
public class TestController {

    @PostMapping("getAll")
    //@ApiOperation(value = "这是getAll")
    @Operation(summary = "这是getAll 干嘛的")
    public MyResponse getAll(@RequestBody(required = false) MyBody myBody) {
        return MyResponse.builder().name(myBody.getName()).age(new Random().nextInt(20, 50)).build();
    }
}
