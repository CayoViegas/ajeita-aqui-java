package com.api.ajeitaaqui.controllers;

import com.api.ajeitaaqui.services.ContractorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/contractor")
public class ContractorController {
    final ContractorService contractorService;

    public ContractorController(ContractorService contractorService) {
        this.contractorService = contractorService;
    }
}
