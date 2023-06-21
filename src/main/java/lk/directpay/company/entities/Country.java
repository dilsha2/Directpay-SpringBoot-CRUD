package lk.directpay.company.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Country {

    private String name;
    private String capital;
    private long population;

//    private HashMap<String,Object> name;
}
