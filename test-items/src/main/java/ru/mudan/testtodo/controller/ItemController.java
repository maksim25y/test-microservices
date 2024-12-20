package ru.mudan.testtodo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mudan.testentity.entity.Item;
import ru.mudan.testentity.entity.User;
import ru.mudan.testtodo.dto.ItemDTO;
import ru.mudan.testtodo.feign.UserFeignClient;
import ru.mudan.testtodo.service.ItemService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;
    private final UserFeignClient userFeignClient;
    //private UserRestBuilder userRestBuilder;
    //private UserWebClientBuilder userWebClientBuilder;
    @Autowired
    public ItemController(ItemService itemService, UserFeignClient userFeignClient) {
        this.itemService = itemService;
        this.userFeignClient = userFeignClient;
    }
    @GetMapping("/all")
    public ResponseEntity<List<ItemDTO>> getAllItems(){
        List<ItemDTO>items = itemService.getAllItems().stream().map(el->new ItemDTO(el.getId(),el.getTitle())).collect(Collectors.toList());
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<List<ItemDTO>>getAllItemsByUserId(@PathVariable("userId")Long userId){
        List<ItemDTO>items = itemService.getAllItemsByUserId(userId).stream().map(el->new ItemDTO(el.getId(),el.getTitle())).collect(Collectors.toList());
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity addItem(@RequestBody Item item){
        ResponseEntity<User>result = userFeignClient.findByUserId(item.getUserId());
        if(result==null){
            return new ResponseEntity("Система пользователей недоступна", HttpStatus.BAD_REQUEST);
        }
        if(result!=null){
              itemService.addItem(item);
              return new ResponseEntity("Success", HttpStatus.OK);
        }

//        if(userFeignClient.findByUserId(item.getUserId())!=null){
//            itemService.addItem(item);
//            return new ResponseEntity("Success", HttpStatus.OK);
//        }
//        userWebClientBuilder.asyncUserExists(item.getUserId()).subscribe(user->System.out.println("User - "+user));

//        if(userWebClientBuilder.userExists(item.getUserId())){
//            itemService.addItem(item);
//            return new ResponseEntity("Success", HttpStatus.OK);
//        }

//        if(userRestBuilder.userExists(item.getUserId())){
//            itemService.addItem(item);
//            return new ResponseEntity("Success", HttpStatus.OK);
//        }

        return new ResponseEntity("Error", HttpStatus.BAD_REQUEST);
    }
}
