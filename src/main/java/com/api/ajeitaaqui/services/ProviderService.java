package com.api.ajeitaaqui.services;

import com.api.ajeitaaqui.repositories.ProviderRepository;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {
    final ProviderRepository providerRepository;

    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }
}
