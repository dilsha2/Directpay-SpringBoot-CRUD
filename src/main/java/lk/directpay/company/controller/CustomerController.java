package lk.directpay.company.controller;

import lk.directpay.company.dto.CustomerDTO;
import lk.directpay.company.service.CustomerService;
import lk.directpay.company.utilities.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(Long id){
        service.deleteCustomer(id);
        return new ResponseUtil(200,id+" : Deleted.!",null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){
        service.updateCustomer(dto);
        return new ResponseUtil(200,"Updated.!",dto);
    }

    @GetMapping
    public ResponseUtil getAllCustomer(){
        ArrayList<CustomerDTO> allCustomers = service.getAllCustomers();
        return new ResponseUtil(200," Success.!",allCustomers);
    }


}
