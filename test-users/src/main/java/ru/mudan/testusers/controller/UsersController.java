package ru.mudan.testusers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mudan.testentity.entity.User;
import ru.mudan.testusers.dto.UserDTO;
import ru.mudan.testusers.service.UserService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsersController {
    private final UserService userService;
    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/all")
    private ResponseEntity<List<UserDTO>> allUsers(){
        List<UserDTO>usersList = userService.getAllUsers().stream().map(el->new UserDTO(el.getId(),el.getName())).collect(Collectors.toList());
        System.out.println();
        return new ResponseEntity<>(usersList, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO>getById(@PathVariable Long id){
        Optional<User> userOptional = userService.findById(id);
        if(userOptional.isPresent()){
            User user = userOptional.get();
            return new ResponseEntity<>(new UserDTO(user.getId(),user.getName()),HttpStatus.OK);
        }
        return new ResponseEntity("Not found",HttpStatus.NOT_FOUND);
    }
}
