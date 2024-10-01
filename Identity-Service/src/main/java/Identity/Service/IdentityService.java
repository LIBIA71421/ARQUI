package com.example.services.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class IdentityService {
    private final Set<String> ciDatabase = new HashSet<>();

    public IdentityService() {
        ciDatabase.add("1234567");
        ciDatabase.add("2345678");
    }

    public boolean verifyCI(String ci) {
        return ciDatabase.contains(ci);
    }
}
