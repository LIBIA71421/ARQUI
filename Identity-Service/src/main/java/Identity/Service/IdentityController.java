package com.example.services.controller;

import com.example.services.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/identity")
public class IdentityController {

    @Autowired
    private IdentityService identityService;

    @GetMapping("/verify/{ci}")
    public boolean verifyCI(@PathVariable String ci) {
        return identityService.verifyCI(ci);
    }
}
