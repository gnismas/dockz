package com.example.docks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    private final UserRepository repository;

    MainController(UserRepository repository) {
        this.repository = repository;
    }
    @Autowired
    private UserRepository userRepository;
    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String userName
            , @RequestParam String password) {


        User n = new User();
        n.setUserName(userName);
        n.setPassword(password);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {

        return userRepository.findAll();
    }



    @DeleteMapping("/deleteUser/{id}")
    public @ResponseBody String deleteUser(@PathVariable String id){
        userRepository.deleteById((long) Integer.parseInt(id));
        return "Deletedasdasd";
    }
    //sdadsdasaadsadas
}