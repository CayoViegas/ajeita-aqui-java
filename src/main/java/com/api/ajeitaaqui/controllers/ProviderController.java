package com.api.ajeitaaqui.controllers;

import com.api.ajeitaaqui.services.ProviderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/provider")
public class ProviderController {
    final ProviderService providerService;

    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }
}
