package lk.directpay.company.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Email {

    private String personalEmail;
    private String subject;
    private String from;
    private String body;
}
