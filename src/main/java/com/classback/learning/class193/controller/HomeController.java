package com.classback.learning.class193.controller;

import com.classback.learning.class193.model.UserDomain;
import com.classback.learning.class193.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserDomain user) {
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize) {
        return userService.findAllUser(pageNum, pageSize);
    }


    @RequestMapping("/test")
    public String index() {
        return "HELLO WORLD!!!!!!";
    }


}