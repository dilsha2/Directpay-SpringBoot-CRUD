package lk.directpay.company.services;

import lk.directpay.company.entities.Country;
import lk.directpay.company.entities.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryService {

    private final RestTemplate restTemplate;

    @Autowired
    public CountryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Country getCountryByCurrency(String currencyCode) {
        String url = "https://restcountries.com/v3.1/currency/"+currencyCode;

        ResponseEntity<Name> response = restTemplate.exchange(url, HttpMethod.GET, null, Name.class, currencyCode);

        if (response.getStatusCode().is2xxSuccessful()) {
            Name countriesResponse = response.getBody();
            if (countriesResponse != null) {
                return countriesResponse.getCountry();
            }
        }

        throw new RuntimeException("Failed to retrieve country: " + response.getStatusCode());
    }
}