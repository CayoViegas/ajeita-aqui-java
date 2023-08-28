package com.api.ajeitaaqui.services;

import com.api.ajeitaaqui.repositories.ContractorRepository;
import org.springframework.stereotype.Service;

@Service
public class ContractorService {
    final ContractorRepository contractorRepository;

    public ContractorService(ContractorRepository contractorRepository) {
        this.contractorRepository = contractorRepository;
    }
}
