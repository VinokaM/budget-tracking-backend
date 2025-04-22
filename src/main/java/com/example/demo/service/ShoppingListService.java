package com.example.demo.service;

import com.example.demo.repository.ShoppingListRepository;
import com.example.demo.model.ShoppingList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShoppingListService {

    @Autowired
    private ShoppingListRepository shoppingListRepository;

    public ShoppingList saveList(ShoppingList shoppingList) {
        return shoppingListRepository.save(shoppingList);
    }

    public List<ShoppingList> getAllLists() {
        return shoppingListRepository.findAll();
    }

    // DELETE
    public void deleteList(String id) {
        shoppingListRepository.deleteById(id);
    }
}
