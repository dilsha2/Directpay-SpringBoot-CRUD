package lk.directpay.company.service.impl;

import lk.directpay.company.dto.CustomerDTO;
import lk.directpay.company.entities.Customer;
import lk.directpay.company.repositories.CustomerRepo;
import lk.directpay.company.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addCustomer(CustomerDTO dto) {
        repo.save(mapper.map(dto, Customer.class));
    }

    @Override
    public void deleteCustomer(Long id) {

    }

    @Override
    public void updateCustomer(CustomerDTO dto) {

    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        return null;
    }
}
