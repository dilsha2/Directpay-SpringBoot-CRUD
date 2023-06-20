package lk.directpay.company.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Customer {

    @Column(name = "customerId")
    @Id
    private Long id;
    private String name;
    private String address;
    private Integer age;
    private String email;
}
