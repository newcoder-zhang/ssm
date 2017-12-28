package com.huawei.controller;

import com.huawei.model.User;
import com.huawei.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    public IUserService userService;

    @RequestMapping("/showUser")
    public ModelAndView showUser(ModelAndView model, HttpServletRequest request){
        String id = request.getParameter("id");
        User user = userService.getUser(Integer.parseInt(id));
        model.addObject("user",user);
        model.setViewName("showUser");

        return model;
    }
}
