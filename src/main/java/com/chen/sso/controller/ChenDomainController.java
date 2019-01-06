package com.chen.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RequestMapping("cpp")
@Controller
public class ChenDomainController {

    @RequestMapping("show")
    @ResponseBody
    public String show(HttpServletRequest request, HttpServletResponse response){
        String id = request.getSession().getId();
        request.getCookies();
        return "THIS IS FROM CHENDOMAIN";
    }

    @RequestMapping("play")
    @ResponseBody
    public String play(){
        return "THIS IS FROM PLAY";
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request){
        System.out.println("chendomain的sessionId"+request.getSession().getId());
        return "login";
    }

    @RequestMapping("index")
    public String toIndex(HttpServletRequest request){
        HttpSession session = request.getSession();
        boolean isLogin = session.getAttribute("isLogin")!=null?true:false;
        if(isLogin){
            return "success";
        }else{
            return "login";
        }
    }



    @RequestMapping("toLogin")
    public String toLogin(String userName,String password,HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("isLogin",true);
        return "success";
    }




}
