package com.example.swagger.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Schema(title = "我的返回对象")
public class MyResponse {

    @Schema(title = "我的名字")
    private String name;

    @Schema(title = "我的年龄")
    private Integer age;
}
