//package com.leyou.item.controller;
//
//import com.leyou.item.pojo.Category;
//import com.leyou.item.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
///**
// * @author LiSheng
// * @date 2019/10/26 15:40
// */
//@RestController
//@RequestMapping("user")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//    @ResponseBody
//    @GetMapping("hello")
//    public String fun(){
//        return "ni hao a";
//    }
//
//    @GetMapping("{id}")
//    public Category queryById(@PathVariable("id")Integer id){
//        return userService.queryById(id);
//    }
//}
