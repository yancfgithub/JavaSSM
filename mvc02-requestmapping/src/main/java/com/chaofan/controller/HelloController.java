package com.chaofan.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yan
 * @create 2021 - 05 - 31 21:18
 */
@RequestMapping("/test")
@Controller
public class HelloController {

    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",": some欢迎你" + request.getParameter("name"));
        mv.addObject("fun",": 你好呀");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/other.do",method = RequestMethod.POST)
    public ModelAndView doOther() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",": other欢迎你");
        mv.addObject("fun",": 你好呀");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/first.do")
    public ModelAndView doFirst() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",": first欢迎你");
        mv.addObject("fun",": 你好呀");
        mv.setViewName("show");
        return mv;
    }
}
