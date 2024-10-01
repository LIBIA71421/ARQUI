package com.example.services;

import com.example.services.service.IdentityService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IdentityServiceTest {

    private final IdentityService identityService = new IdentityService();

    @Test
    void testVerifyCIExists() {
        assertTrue(identityService.verifyCI("1234567"));
    }

    @Test
    void testVerifyCINotExists() {
        assertFalse(identityService.verifyCI("9999999"));
    }
}