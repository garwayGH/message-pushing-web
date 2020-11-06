package com.viatom.messagepushingweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qiujiawei
 * @description PageController
 * @date 2020/8/10 15:16
 */
@Controller
@RequestMapping("/api")
public class PageController {


    @GetMapping("/bootstrap")
    public String bootstrap() {
        return "bootstraptest";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
