package lk.directpay.company.services;

import lk.directpay.company.entities.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmailService {

    private final RestTemplate restTemplate;

    @Autowired
    public EmailService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendEmail(Email email) {
        String url = "https://api.sendgrid.com/v3/mail/send";

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth("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");
        headers.set("Content-Type", "application/json");

        HttpEntity<Email> requestEntity = new HttpEntity<>(email, headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);

        if (!response.getStatusCode().is2xxSuccessful()) {
            throw new RuntimeException("Failed to send email: " + response.getBody());
        }
    }

}

