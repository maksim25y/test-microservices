package ru.mudan.testtodo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mudan.testtodo.dto.ItemDTO;
import ru.mudan.testtodo.service.ItemService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
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
}
