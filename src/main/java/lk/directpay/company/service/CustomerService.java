package lk.directpay.company.service;

import lk.directpay.company.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {

    public void addCustomer(CustomerDTO dto);

    public void deleteCustomer(Long id);

    public void updateCustomer(CustomerDTO dto);

    public ArrayList<CustomerDTO> getAllCustomers();
}
