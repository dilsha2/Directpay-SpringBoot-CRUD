package lk.directpay.company.controller;

import lk.directpay.company.dto.CustomerDTO;
import lk.directpay.company.service.CustomerService;
import lk.directpay.company.utilities.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService service;


    @PostMapping
    public ResponseUtil saveCustomer(@RequestBody CustomerDTO dto){
        service.addCustomer(dto);
        return new ResponseUtil(200, " Added.!",dto);
    }

}
