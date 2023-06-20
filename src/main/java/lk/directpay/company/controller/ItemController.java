package lk.directpay.company.controller;

import lk.directpay.company.entities.Item;
import lk.directpay.company.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    private final ItemService service;

    @Autowired
    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        return service.getItemById(id);
    }
}
