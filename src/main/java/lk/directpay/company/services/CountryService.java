package lk.directpay.company.services;

import lk.directpay.company.entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryService {

    private final RestTemplate restTemplate;

    public CountryService() {
        this.restTemplate = new RestTemplate();
    }

    public Country[] getCountriesByCurrency(String currencyCode) {
        String url = "https://restcountries.com/v3.1/currency/{currencyCode}";

        ResponseEntity<Country[]> response = restTemplate.exchange(url, HttpMethod.GET, null, Country[].class, currencyCode);

        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        } else {
            throw new RuntimeException("Failed to retrieve countries: " + response.getStatusCode());
        }
    }
}