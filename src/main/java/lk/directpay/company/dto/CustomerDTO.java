package lk.directpay.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {

    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

}
