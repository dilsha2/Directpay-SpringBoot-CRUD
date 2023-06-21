package lk.directpay.company.controller;

import lk.directpay.company.entities.Country;
import lk.directpay.company.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/currency/{currencyCode}")
    public Country[] getCountriesByCurrency(@PathVariable String currencyCode) {
        return countryService.getCountriesByCurrency(currencyCode);
    }
}