package AuthLogin.UsersAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import AuthLogin.UsersAPI.model.User;
import AuthLogin.UsersAPI.repository.userRepository;
import org.springframework.web.client.RestTemplate;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class userController {
    @Autowired
    userRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value="/user/{idUsuario}")
    public User getUser(@PathVariable("idUsuario") int idUsuario){
        return userRepository.findByIdUsuario(idUsuario);
    }


    @PostMapping(value = "/user/add")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }


}
