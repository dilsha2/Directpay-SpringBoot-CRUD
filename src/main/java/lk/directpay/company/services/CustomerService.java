package lk.directpay.company.services;

import lk.directpay.company.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {

    void addCustomer(CustomerDTO dto);

    void deleteCustomer(Long id);

    void updateCustomer(CustomerDTO dto);

    ArrayList<CustomerDTO> getAllCustomers();
}
