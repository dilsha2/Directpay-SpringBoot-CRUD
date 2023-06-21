package lk.directpay.company.services;

import lk.directpay.company.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemService {

    private final RestTemplate restTemplate;

    @Autowired
    public ItemService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Item getItemByCode(Long itemCode) {
        String url = "http://localhost:8080/items/{code}";

        ResponseEntity<Item> response = restTemplate.exchange(url, HttpMethod.GET, null, Item.class, itemCode);

        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        } else {
            throw new RuntimeException("Failed to retrieve item: " + response.getStatusCode());
        }
    }
}
