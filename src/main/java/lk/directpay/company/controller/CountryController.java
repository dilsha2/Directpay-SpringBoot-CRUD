package lk.directpay.company.controller;

import lk.directpay.company.entities.Country;
import lk.directpay.company.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
@CrossOrigin
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/currency/{currencyCode}")
    public Country[] getCountryByCurrency(@PathVariable String currencyCode) {
        return countryService.getCountriesByCurrency(currencyCode);
    }
}