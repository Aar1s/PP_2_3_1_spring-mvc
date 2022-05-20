package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/")
    public String index(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
    return "main_page";
    }



    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user, Model model) {
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        System.out.println(user.getName());
        userService.add(user);
        return "redirect:/users/";
    }

}
