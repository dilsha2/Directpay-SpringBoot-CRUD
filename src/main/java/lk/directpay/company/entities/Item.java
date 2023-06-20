package lk.directpay.company.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
//@Entity
@Data
public class Item {

//    @Column(name = "itemCode")
//    @Id
    private Long itemCode;
    private String itemName;
}
