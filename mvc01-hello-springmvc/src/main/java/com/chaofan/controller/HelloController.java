package com.chaofan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yan
 * @create 2021 - 05 - 31 21:18
 */
@Controller
public class HelloController {

    @RequestMapping("/some.do")
    public ModelAndView some() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎");
        mv.addObject("fun","你好呀");
        mv.setViewName("show");
        return mv;
    }
}
