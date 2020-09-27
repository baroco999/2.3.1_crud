package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String getAllUsers(ModelMap model) {
        model.addAttribute("listOfUsers", userService.getAllUsers());
        return "index";
    }

    @GetMapping(value = "/edit")
    public String editUser(@RequestParam int id, ModelMap model) {
        model.addAttribute("user", userService.getUserById(id));
        return "edit";
    }

    @PostMapping(value = "/edit")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/";
    }

    @GetMapping(value = "/add")
    public String addUser() {
        return "add";
    }

    @PostMapping(value = "/add")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping(value="/delete")
    public String deleteUser(@RequestParam int id) {
        userService.removeUserById(id);
        return "redirect:/";
    }

    @GetMapping(value = "/clearAll")
    public String clearAll() {
        userService.cleanUsersTable();
        return "redirect:/";
    }
}
