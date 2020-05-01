package com.lagou.demo.controller;

import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Orz
 */
@LagouController
@LagouRequestMapping("/test")
public class TestController {

    @LagouRequestMapping("/test1")
    @Security({"zhangsan"})
    public void test1(HttpServletRequest request, HttpServletResponse response,String username){
        System.out.println("test1，zhangsan...");
    }

    @LagouRequestMapping("/test2")
    @Security({"zhangsi"})
    public void test2(HttpServletRequest request, HttpServletResponse response,String username){
        System.out.println("test2，zhangsi...");
    }

    @LagouRequestMapping("/test3")
    @Security({"zhangsan","zhangsi"})
    public void test3(HttpServletRequest request, HttpServletResponse response,String username){
        System.out.println("test3，zhangsan,zhangsi...");
    }

    @LagouRequestMapping("/test4")
    public void test4(HttpServletRequest request, HttpServletResponse response, String username){
        System.out.println("test4，...");
    }


}
