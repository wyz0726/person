package com.duo.controller;

import com.duo.domain.TbUser;
import com.duo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("person")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("ListUsers")
    public String ListUsersIndex(Model model){
        List<TbUser> list=userService.selectAllUser();
        model.addAttribute("userList",list);
        return "index";
    }
}
