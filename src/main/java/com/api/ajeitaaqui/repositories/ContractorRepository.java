package com.api.ajeitaaqui.repositories;

import com.api.ajeitaaqui.models.ContractorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContractorRepository extends JpaRepository<ContractorModel, UUID> {
}
