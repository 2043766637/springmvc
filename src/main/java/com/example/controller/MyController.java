package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping(value = {"/some.do","/first.do"},method = RequestMethod.GET)
    public ModelAndView doSome(HttpServletRequest request, HttpServletResponse response, HttpSession session){

        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发"+request.getParameter("name"));
        mv.addObject("fun","执行的是doSome方法");
//        mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = {"/other.do","/second.do"},method = RequestMethod.POST)
    public ModelAndView doOther(){

        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doOther方法");
//        mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("show");
        return mv;
    }

}
