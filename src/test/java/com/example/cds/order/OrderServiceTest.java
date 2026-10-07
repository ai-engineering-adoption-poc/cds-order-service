package com.example.cds.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {

    @Test
    void shouldCreateOrderReference() {
        String customerId = "C1001";
        String productId = "P2001";

        String orderReference = customerId + "-" + productId;

        assertEquals("C1001-P2001", orderReference);
    }
}
