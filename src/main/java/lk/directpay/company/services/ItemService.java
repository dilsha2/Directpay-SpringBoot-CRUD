package lk.directpay.company.services;

import lk.directpay.company.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;

@Service
@Transactional
public class ItemService {

    private final RestTemplate restTemplate;

    @Autowired
    public ItemService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Item getItemById(Long itemId){
        String apiUrl = "http://localhost:8080/item/{id}";
        return restTemplate.getForObject(apiUrl, Item.class, itemId);
    }
}
