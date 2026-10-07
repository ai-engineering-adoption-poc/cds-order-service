package com.cds.order;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class OrderService {
    private final RestClient client = RestClient.create();

    public String checkCustomer(String customerId) {
        return client.get()
            .uri("http://localhost:8081/api/customers/" + customerId)
            .retrieve()
            .body(String.class);
    }

    public String checkProduct(String productId) {
        return client.get()
            .uri("http://localhost:8082/api/products/" + productId)
            .retrieve()
            .body(String.class);
    }

    public String requestPayment(String request) {
        return client.post()
            .uri("http://localhost:8083/api/payments")
            .body(request)
            .retrieve()
            .body(String.class);
    }

    public String sendNotification(String request) {
        return client.post()
            .uri("http://localhost:8084/api/notifications")
            .body(request)
            .retrieve()
            .body(String.class);
    }
}
