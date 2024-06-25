package ru.mudan.testtodo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mudan.testentity.entity.Item;
import ru.mudan.testtodo.repositories.ItemRepository;

import java.util.List;

@Service
@Transactional
public class ItemService {
    private final ItemRepository itemRepository;
    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
    public List<Item>getAllItemsByUserId(Long userId){
        return itemRepository.findAllByUserId(userId);
    }
}
