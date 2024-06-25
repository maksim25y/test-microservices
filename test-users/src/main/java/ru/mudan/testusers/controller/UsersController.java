package ru.mudan.testusers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mudan.testusers.dto.UserDTO;
import ru.mudan.testusers.service.UserService;

import java.util.List;
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
        return new ResponseEntity<>(usersList, HttpStatus.OK);
    }}
