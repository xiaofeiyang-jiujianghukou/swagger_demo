package com.example.swagger.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Schema(title = "我的对象")
public class MyBody {

    @Schema(title = "名字")
    private String name;
}
