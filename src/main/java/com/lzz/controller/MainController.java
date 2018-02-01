package com.lzz.controller;

import com.lzz.logic.MainLogic;
import com.lzz.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lzz on 2018/1/21.
 */
@org.springframework.stereotype.Controller
public class MainController {
    @Resource
    MainLogic logic;

    @RequestMapping("/postman")
    public String postman(Model model) {
        return "postman";
    }

    @RequestMapping("/posturl")
    public String posturl(Model model) {
        return "posturl";
    }

    @RequestMapping("/user-list")
    @ResponseBody
    public List<User> userList() {
        return logic.userList();
    }
}
